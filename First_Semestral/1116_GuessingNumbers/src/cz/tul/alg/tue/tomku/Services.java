package cz.tul.alg.tue.tomku;

public class Services {
    static void userGuesses() {
        int guess;
        boolean win = false;
        int number = generateNumber(Main.min, Main.max);

        do {
            System.out.print("\nHádej číslo: ");
            guess = Main.sc.nextInt();

            if (number > guess) {
                System.out.println("Hádane číslo je větší.");
            } else if (number < guess) {
                System.out.println("Hádané číslo je menší.");
            } else {
                System.out.println("Uhodl jsi!");
                win = true;
            }
        } while (!win);
    }

    static void computerGuesses() {
        int guess;
        int lowLimit = Main.min;
        int highLimit = Main.max;
        int number;

        boolean win = false;

        do {
            System.out.println("Zadej číslo v intervalu 1 - 100");
            number = Main.sc.nextInt();
        } while (number < 1 || number > 100);

        do {
            guess = (lowLimit + highLimit) / 2;
            System.out.format("Hádané číslo počítačem je: %s", guess);

            if (number > guess) {
                System.out.println("\nHádane číslo je větší.");
                lowLimit = guess + 1;
            } else if (number < guess) {
                System.out.println("\nHádané číslo je menší.");
                highLimit = guess - 1;
            } else {
                System.out.println("\nPočítač uhodl náhodné číslo!");
                win = true;
            }
        } while (!win);
    }

    private static int generateNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}