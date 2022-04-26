package kulhavy;

import java.util.ArrayList;
import java.util.Scanner;

public class CompetitionApp {
   
    final private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        Competition zavod = new Competition("Jizerská 50");
        /*
        zavod.registerRacer("Dominik", "Šefr", 2001, gender.male);
        zavod.registerRacer("Adam", "Petříček", 2001, gender.twoSpirit);
        
        zavod.racerStart(1, "10:00:00");
        zavod.racerStart(2, "12:13:59");
        
        zavod.racerFinish(1, "12:05:43");
        zavod.racerFinish(2, "13:53:05");
        
        System.out.println(zavod);
        */        
        
        zavod.registerRacer("Paní", "Žaneta", 2001, Gender.female);
        zavod.registerRacer("Pan", "Zbigor", 2001, Gender.male);
        zavod.registerRacer("Pan", "Dominik", 2001, Gender.male);
        zavod.registerRacer("Pan", "dominik", 2001, Gender.male);
        zavod.registerRacer("Pan", "ďominik", 2001, Gender.male);
        zavod.registerRacer("Pan", "Ďominik", 2001, Gender.male);
        zavod.registerRacer("Pan", "Ďábel", 2001, Gender.male);
        zavod.registerRacer("Pan", "Čeněk", 2001, Gender.male);
        zavod.registerRacer("Pan", "Cycil", 2001, Gender.male);
        
        printRacers(zavod.racersSortedBySurname());
    }
    
    public static void printRacers(ArrayList<Racer> copy) {
        for (Racer rcr : copy) {
            System.out.println(rcr);
        }
    }
    
}
