package cz.tul.alg.tue.tomku;

import java.util.Scanner;

public class Cifry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long end;

        do {
            long number = sc.nextLong();
            end = number;
            long CifSoucet = 0;
            long CifSoucin = 1;

            while (number > 0) {
                CifSoucet = CifSoucet + number % 10;
                CifSoucin *= number % 10;
                number /= 10;
            }

            System.out.format("%s %s\n", CifSoucet, CifSoucin);
        } while (end > 0);
    }
}
