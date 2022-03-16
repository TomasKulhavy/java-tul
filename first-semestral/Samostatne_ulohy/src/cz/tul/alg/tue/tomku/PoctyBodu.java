package cz.tul.alg.tue.tomku;

import java.util.Locale;
import java.util.Scanner;

public class PoctyBodu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int pocetVstupu = 0;
        pocetVstupu = sc.nextInt();

        int k1 = 0;
        int k2 = 0;
        int k3 = 0;
        int k4 = 0;

        for (int i = 0; i < pocetVstupu; i++) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            if (x < 0) {
                if (y < 0) {
                    k3++;
                } else if (y >= 0) {
                    k2++;
                }
            } else if (x == 0) {
                if (y < 0) {
                    k3++;
                } else if (y >= 0) {
                    k1++;
                }
            } else if (x >= 0) {
                if (y >= 0) {
                    k1++;
                } else if (y < 0) {
                    k4++;
                }
            }
        }
        System.out.format("%s  %s  %s  %s\n", k1, k2, k3, k4);
    }
}
