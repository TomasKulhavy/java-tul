package cz.tul.alg.tue.tomku;

import java.util.Scanner;
import java.util.Locale;

public class VypisRealneCislo {
    public static void main(String[] arg) {
        Locale loc = new Locale("CS", "cz");
        Scanner sc = new Scanner(System.in);
        sc.useLocale(loc);
        double cislo = sc.nextDouble();
        System.out.format(loc, "%10.3f", cislo);
    }
}