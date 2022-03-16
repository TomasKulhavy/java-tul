package cz.tul.alg.tue.tomku.pkg1910_real_numbers;

import java.util.Locale;
import java.util.Scanner;

public class P6Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.ENGLISH); //desetiná čárka, tečka (nastavení)
        final double pi = Math.PI;

        System.out.println("Zadejte poloměr kruhu: ");

        double radius = scanner.nextDouble();

        double circumference = 2 * (pi * radius);
        double volume = pi * (radius * radius);

        System.out.println(String.format("Obvod kruhu je: %.2f\nObsah kruhu je: %.2f", circumference, volume));
    }
}
