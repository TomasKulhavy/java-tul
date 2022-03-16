package cz.tul.alg.tue.tomku;

import java.util.Arrays;
import java.util.Scanner;

public class Rozsah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pocetCisel;

        do {
            pocetCisel = sc.nextInt();
            if (pocetCisel < 0) break;
            int [] pole = new int [pocetCisel];

            for (int i = 0; i < pocetCisel; i++) {
                pole[i] = sc.nextInt();
            }

            int min = Arrays.stream(pole).min().getAsInt();
            int max = Arrays.stream(pole).max().getAsInt();

            System.out.format("%s %s\n", min, max);
        } while (pocetCisel > 0);
    }
}
