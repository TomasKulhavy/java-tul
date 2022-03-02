package cz.tul.alg.tue.tomku;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int min = 1;
    static int max = 100;

    public static void main(String[] args) {
        boolean end = false;
        int choice;
        do {
            displayMenu();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Services.userGuesses();
                    break;
                case 2:
                    Services.computerGuesses();
                    break;
                case 0:
                    end = true;
                    break;
                default:
                    System.out.println("Neplatná volba! Pouze 0-2");
                    break;
            }
        } while (!end);
    }

    private static void displayMenu() {
        System.out.println("\n1 - Hádá uživatel");
        System.out.println("2 - Hádá počítač");
        System.out.println("0 - Konec\n");
    }
}