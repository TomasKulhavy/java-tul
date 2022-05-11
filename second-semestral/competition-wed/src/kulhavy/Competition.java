package kulhavy;

import java.io.*;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.NoSuchElementException;

public class Competition {
    
    private String name;
    private ArrayList<Racer> racers;

    public void loadStart(File startFile) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(startFile))) { // uzavření souboru automaticky s TRY WITH RESOURCES
            String line, firstName, lastName;
            int dob;
            char gender;
            String[] parts;
            Racer r;

            bufferedReader.readLine(); // přeskočení hlavičky
            while ((line = bufferedReader.readLine()) != null) {
                parts = line.split("[ ]+");
                firstName = parts[0];
                lastName = parts[1];
                dob = Integer.parseInt(parts[2]);
                gender = parts[3].charAt(0);
                Gender genderEnum;

                if (gender == 'm') {
                    genderEnum = Gender.male;
                } else {
                    genderEnum = Gender.female;
                }
                r = new Racer(firstName, lastName, dob, genderEnum);
                racers.add(r);
            }
        }
    }
    
    public Competition(String name) {
        this.name = name;
        racers = new ArrayList<>();
    }
    
    // Registrace nového závodníka
    public void registerRacer(String forename, String surname, int birthYear, Gender racerGender) {
        Racer rcr = new Racer(forename, surname, birthYear, racerGender);
        rcr.setCompetition(this);
        racers.add(rcr);
    }    
    
    // Nastavení startovního/cílového času
    public void racerStart(int registrationNumber, String time) {
        Racer rcr = findRacerByNumber(registrationNumber);
        rcr.setStartTime(time);
    }
    
    public void racerStart(int registrationNumber, int hours, int minutes, int seconds) {
        Racer rcr = findRacerByNumber(registrationNumber);
        rcr.setStartTime(hours, minutes, seconds);
    }
    
    public void racerFinish(int registrationNumber, String time) {
        Racer rcr = findRacerByNumber(registrationNumber);
        rcr.setFinishTime(time);
    }
    
    public void racerFinish(int registrationNumber, int hours, int minutes, int seconds) {
        Racer rcr = findRacerByNumber(registrationNumber);
        rcr.setFinishTime(hours, minutes, seconds);
    }
    
    // Pomocná metoda pro nalezení závodníka
    private Racer findRacerByNumber(int registrationNumber) {
        Racer rtrn = null;
        for (Racer rcr : racers) {
            if (registrationNumber == rcr.getRegistrationNumber()) {
                rtrn = rcr;
                break;
            }
        }
        if (rtrn == null) throw new NoSuchElementException("Závodník s tímto číslem neexistuje");        
        return rtrn;
    }
    
    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(String.format("%s:\n", name));
        for (Racer rcr : racers) {
            sb.append(rcr.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
    
    // Sortin'    
    // Setříděno dle příjmení (využívá compareTo ve třídě Racer)
    public ArrayList<Racer> racersSortedBySurname() {
        ArrayList<Racer> list = new ArrayList<>(racers);        
        Collections.sort(list);
        return list;
    }
    // Předdefinovaný komparátor
    public static final Collator col = Collator.getInstance(new Locale("cs","cz"));
    public static final Comparator<Racer> COMP_BY_NAME = (Racer r1, Racer r2) -> {
        int value = col.compare(r1.getSurname(), r2.getSurname());
        if (value == 0) {
            value = col.compare(r1.getForename(), r2.getForename());
        }
        return value;
    };
    
    public void sortBySurnameConst() {        
        Collections.sort(racers, COMP_BY_NAME);
    }
    
    // Střiď podle runTime
    // - Třída Comparator
    public void sortByRunTime() {        
        Collections.sort(racers, new ComparatorRacerByRunTime());
    }    
    
    // - Anonymní vnitřní třída
    public void sortByRunTimeAnonymous() {        
        Collections.sort(racers, new Comparator<Racer>(){
            @Override
            public int compare(Racer o1, Racer o2) {
                return Long.compare(o1.runTime(), o2.runTime());                
            }
        });
    }
    // - Lambda výraz
    public void sortByRunTimeLambda() {        
        Collections.sort(racers, (Racer o1, Racer o2) -> Long.compare(o1.runTime(), o2.runTime()));
    }

    public static void main(String[] args) {
        Competition competition = new Competition("Run czech");
        try {
            competition.loadStart(new File("start"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(competition);
    }
}
