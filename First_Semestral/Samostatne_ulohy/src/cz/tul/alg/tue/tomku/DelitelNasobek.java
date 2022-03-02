package cz.tul.alg.tue.tomku;

import java.util.Scanner;

public class DelitelNasobek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = 1;
        long b = 1;
        do {
            a = sc.nextInt();
            if (a < 0) break;
            b = sc.nextInt();
            long NSN = a * b;
            long c;
            while (b != 0) {
                c = b;
                b = a % b;
                a = c;
            }
            NSN /= a;
            System.out.format("%s %s\n", a, NSN);
        } while (a >= 0);
    }
}
