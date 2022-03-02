package cz.tul.alg.tue.tomku.fitness;

import java.util.Scanner;

public class KulhavyTomasFitness {

    public static void main(String[] args) {
        System.out.println("Vítejte ve fitness kalkulačce.\n");
        
        Scanner scanner = new Scanner(System.in);
        
        double BMI = 0.0;
        double BMR = 0.0;
        double TDEE = 0.0;
        
        double hmotnost = 0.0;
        double vyska = 0.0;
        int vek = 0;
        int pohlavi = 0;
        
        int vyberTDEE = 0;
        
        System.out.println("Zadejte svoji hmotnost v [kg].");
        hmotnost = scanner.nextDouble();
        System.out.println("Zadejte svoji výšku v [m].");
        vyska = scanner.nextDouble();
        System.out.println("Zadejte svůj věk.");
        vek = scanner.nextInt();
        System.out.println("Zadejte pohlaví [0 = Muž, 1 = Žena]");
        pohlavi = scanner.nextInt();
        
        System.out.println("\nNyní si vyberte z následujících možností pro vypočítání celkové denní spotřeby energie.");
        System.out.println("");
        System.out.println("Úroveň aktivity | Aktivita");        
        System.out.println("1) NEPATRNÁ | SPÁNEK");
        System.out.println("2) VELMI MALÁ | ČTENÍ, TV");
        System.out.println("3) MALÁ | PRÁCE V KANCELÁŘI (DOMÁCNOSTI)");
        System.out.println("4) STŘEDNÍ | LEHKÁ MAN. PRÁCE/SPORT");
        System.out.println("5) VELKÁ | TĚŽŠÍ MAN. PRÁCE/SPORT");
        System.out.println("6) EXTRÉMNÍ | NÁROČNÁ MAN. PRÁCE/SPORT");
        System.out.println("Napište pouze číslo aktivity.");
        
        vyberTDEE = scanner.nextInt();
        
        BMI = hmotnost / Math.pow(vyska, 2);
        String BMIvysledek = (BMI > 25) ? "Máte nadváhu" : (BMI < 18.5) ? "Máte podváhu" : "Jste v normě";
        
        if (pohlavi == 0) {
            BMR = 10 * hmotnost + 6.25 * (vyska*100) -5 * vek + 5;
        }
        
        else if (pohlavi == 1) {
            BMR = 10 * hmotnost + 6.25 * (vyska*100) -5 * vek - 161;
        }
        
        System.out.format("\nVaše BMI (index tělesné hmotnosti) hodnota je: %.1f ==> %s\n", BMI, BMIvysledek);
        System.out.format("Vaše BMR (nejmenší množství energie k zajištění zákl. funkcí organismu) hodnota je: %.1f\n", BMR);
    } 
}
