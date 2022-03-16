package cz.tul.alg.tue.tomku;

import java.util.Scanner;

public class RozkladCisla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int end;
        do {
            String vysledek = "";
            int number;
            number = sc.nextInt();
            if(number < 0) break;
            end = number;
            int startNumber = number;

            if (number <= 0) {
                vysledek = "Nelze!";
            } else {
                for (int i = 2; i <= number; i++) {
                    while (number % i == 0) {
                        number /= i;
                        vysledek += i + " ";
                    }
                }
            }

            System.out.format("%s", vysledek.substring(0, vysledek.length() - 1));
        } while (end > 0);
    }
}
