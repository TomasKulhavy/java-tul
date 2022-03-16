package cz.tul.alg.tue.tomku;

import java.util.Scanner;

public class BarvaPole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 1;
        int b = 1;
        do {
            a = sc.nextInt();
            if (a < 0) break;
            b = sc.nextInt();
            int c = a + b;

            String vysledek = (c % 2 == 0) ? "BILA" : "CERNA";
            System.out.println(vysledek);
        } while (a >= 0);
    }
}
