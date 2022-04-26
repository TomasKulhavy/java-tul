package kulhavy;

import java.text.Collator;
import java.util.Locale;

public class Racer implements Comparable<Racer> {

    private String forename;
    private String surname;
    private Competition race;
    private int birthYear;
    private Gender gender;
    //private String clubName;
    private static int registrationNumberCounter = 1;
    private int registrationNumber;
    //private int wave;
    private Time startTime;
    private Time finishTime;
    //private long time;
    //private racerState currentState;

    // Konstruktor
    public Racer(String forename, String surname, int birthYear, Gender racerGender) {
        this.forename = forename;
        this.surname = surname;
        //this.race = race;
        this.registrationNumber = registrationNumberCounter++;
        this.birthYear = birthYear;
        this.gender = racerGender;
        //this.clubName = clubName;
    }

    // Vrátí počet sekund, za jak dlouho závodník uběhl závod;
    public long runTime() {
        return finishTime.getSecondsTotal() - startTime.getSecondsTotal();
    }

    // Vrátí String se zformátovaným časem, za jaký závodník uběhl závod
    public String runTimeFormatted() {
        long time = finishTime.getSecondsTotal() - startTime.getSecondsTotal();
        return TimeTools.longToString(time);
    }

    // -- Gettery --
    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public String getStartTime() {
        return startTime.timeToString();
    }

    public String getFinishTime() {
        return finishTime.timeToString();
    }

    public String getSurname() {
        return surname;
    }

    public String getForename() {
        return forename;
    }

    // -- Settery --
    public void setStartTime(String time) {
        startTime = new Time(time);
    }

    public void setStartTime(int hours, int minutes, int seconds) {
        startTime = new Time(hours, minutes, seconds);
    }

    public void setFinishTime(String time) {
        if (startTime == null) {
            throw new StartTimeNotSet("Ještě nebyl zadán čas startu");
        }
        finishTime = new Time(time);
    }

    public void setFinishTime(int hours, int minutes, int seconds) {
        if (startTime == null) {
            throw new StartTimeNotSet("Ještě nebyl zadán čas startu");
        }
        finishTime = new Time(hours, minutes, seconds);
    }

    public void setCompetition(Competition race) {
        this.race = race;
    }

    // regex example
    /*
    public void setClubName(String clubName) {
        if (clubName.matches("[A-Z](2,5)")) {
            throw new IllegalArgumentException("Nevalidní název klubu");
        }
        this.clubName = clubName;
    }
    */

    // toString
    @Override
    public String toString() {
        return String.format("%10s %10s %5d %15s %15s %15s", forename, surname, registrationNumber,getStartTime(), getFinishTime(), runTimeFormatted());
    }

    // compareTo
    // -- Compare příjmení
    @Override
    public int compareTo(Racer other) {
        Collator collator = Collator.getInstance(new Locale("cs","cz"));
        return collator.compare(this.surname, other.surname);
    }

}

/*enum racerState {

}*/

enum Gender {
    male, female, transgender, genderNeutral, nonBinary, agender, pangender, genderqueer, twoSpirit
}