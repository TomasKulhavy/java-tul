package cz.tul.alg.tue.tomku;

import java.util.Locale;
import java.util.Scanner;

public class ChristmasPresent {
    public static int generateNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String odpoved = "";
        System.out.println("Byl jsi letos hodný?");
        while (!(odpoved.equals("ano") || odpoved.equals("ne"))) {
            System.out.print("ANO/NE >>> ");
            odpoved = (sc.nextLine()).toLowerCase(Locale.ROOT);
        }

        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_WHITE = "\u001B[37m";
        final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        final String ANSI_RED_BACKGROUND = "\u001B[41m";
        final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

        int l = 1; // počet řádků
        int c = 1; // počet sloupců

        System.out.println();
        System.out.print("Zadej počet řádků: ");
        while (!(l >= 4)) {
            System.out.println("Nejmenší počet řádků je 4!");
            l = sc.nextInt();
        }
        System.out.print("Zadej počet sloupců: ");
        while (!(c >= 4)) {
            System.out.println("Nejmenší počet sloupců je 4!");
            c = sc.nextInt();
        }

        if (odpoved.equals("ano")) {
            System.out.println();
            System.out.println(ANSI_RED + "VESELÉ VÁNOCE");
            System.out.println(ANSI_RED + "Zde je tvůj dárek k Vánocům.");
            System.out.print(ANSI_GREEN_BACKGROUND + ANSI_GREEN + ". ");
            for (int nRow = 1; nRow <= c - 2; nRow++) {
                if (nRow == c / 2 - 1 || nRow == c / 2) {
                    System.out.print(ANSI_RED_BACKGROUND + ANSI_RED + "_  ");
                } else {
                    System.out.print(ANSI_GREEN_BACKGROUND + ANSI_GREEN + "_  ");
                }
            }
            System.out.print(ANSI_GREEN_BACKGROUND + ANSI_GREEN + ". " + ANSI_RESET);
            System.out.println();
            for (int i = 0; i < l - 2; i++) {
                if (i == l / 2 - 2 || i == l / 2 - 1) {
                    System.out.print(ANSI_RED_BACKGROUND + ANSI_RED + "| ");
                } else {
                    System.out.print(ANSI_GREEN_BACKGROUND + ANSI_GREEN + "| ");
                }
                for (int j = 0; j < c - 2; j++) {
                    if (j == c / 2 - 2 || j == c / 2 - 1) {
                        System.out.print(ANSI_RED_BACKGROUND + ANSI_RED + "|  ");
                    } else if (i == l / 2 - 2 || i == l / 2 - 1) {
                        System.out.print(ANSI_RED_BACKGROUND + ANSI_RED + "_  ");
                    } else {
                        System.out.print(ANSI_GREEN_BACKGROUND + "   ");
                    }
                }
                if (i == l / 2 - 2 || i == l / 2 - 1) {
                    System.out.print(ANSI_RED_BACKGROUND + ANSI_RED + "| " + ANSI_RESET);
                } else {
                    System.out.print(ANSI_GREEN_BACKGROUND + ANSI_GREEN + "| " + ANSI_RESET);
                }
                System.out.println();
            }
            System.out.print(ANSI_GREEN_BACKGROUND + ANSI_GREEN + ". ");
            for (int nRow = 1; nRow <= c - 2; nRow++) {
                if (nRow == c / 2 - 1 || nRow == c / 2) {
                    System.out.print(ANSI_RED_BACKGROUND + ANSI_RED + "_  ");
                } else {
                    System.out.print(ANSI_GREEN_BACKGROUND + ANSI_GREEN + "_  ");
                }
            }
            System.out.print(ANSI_GREEN_BACKGROUND + ANSI_GREEN + ". ");
        } else if (odpoved.equals("ne")) {
            System.out.println();
            System.out.println("Nebyl jsi hodný, takže jsi dostal uhlí.");
            System.out.print(ANSI_WHITE_BACKGROUND + ANSI_WHITE + ". ");
            for (int nRow = 1; nRow <= c - 2; nRow++) {
                System.out.print(ANSI_WHITE_BACKGROUND + ANSI_WHITE + "_  ");
            }
            System.out.print(ANSI_WHITE_BACKGROUND + ANSI_WHITE + ". " + ANSI_RESET);
            System.out.println();

            for (int i = 0; i < l - 2; i++) {
                System.out.print(ANSI_WHITE_BACKGROUND + ANSI_WHITE + "| " + ANSI_RESET);
                for (int j = 0; j < c - 2; j++) {
                    if (generateNumber(1,l) > (l / 2)) {
                        System.out.print(ANSI_WHITE_BACKGROUND + ANSI_BLACK + "\u25A0  ");
                    } else {
                        System.out.print(ANSI_WHITE_BACKGROUND + ANSI_WHITE + "\u2588  ");
                    }
                }
                System.out.print(ANSI_WHITE_BACKGROUND + ANSI_WHITE + "| " + ANSI_RESET);
                System.out.println();
            }

            System.out.print(ANSI_WHITE_BACKGROUND + ANSI_WHITE + ". ");
            for (int nRow = 1; nRow <= c - 2; nRow++) {
                System.out.print(ANSI_WHITE_BACKGROUND + ANSI_WHITE + "_  ");
            }
            System.out.print(ANSI_WHITE_BACKGROUND + ANSI_WHITE + ". " + ANSI_RESET);
            System.out.println();
        }
    }
}
