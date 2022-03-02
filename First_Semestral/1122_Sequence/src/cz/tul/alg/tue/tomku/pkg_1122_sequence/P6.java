package cz.tul.alg.tue.tomku.pkg_1122_sequence;

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Zadej počet: ");
        int n = sc.nextInt();
        System.out.println("Zadej " + n + " čísel.");

        int number;
        int countPrimes = 0;

        for (int i = 0; i < n; i++) {
            number = sc.nextInt();
            if (isPrime(number)) {
                countPrimes++;
            }
        }
        System.out.println("Počet prvočísel je: " + countPrimes);
    }

    private static boolean isPrime(int number) {
        boolean prime = true;

        if (number < 2) {
            prime = false;
        } else {
            for (int i = 2; prime == true && i <= number / 2; i++) {
                if (number % i == 0) {
                    prime = false;
                }
            }
        }
        return prime;
    }
}
