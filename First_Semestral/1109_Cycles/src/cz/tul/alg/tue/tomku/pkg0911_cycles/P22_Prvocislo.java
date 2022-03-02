package cz.tul.alg.tue.tomku.pkg0911_cycles;

import java.util.Scanner;

public class P22_Prvocislo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char answer = 'n';
        int prime = 0;
        boolean isPrime;

        do {
            System.out.println("Zadejte číslo: ");
            prime = scanner.nextInt();
            isPrime = true;

            if (prime < 2) {
                isPrime = false;
            } else {
                for (int i = 2; isPrime == true && i <= prime / 2; i++) {
                    if (prime % i == 0) {
                        isPrime = false;
                    }
                }
            }

            System.out.format("Číslo %s %s prvočíslo.\n", prime, (isPrime) ? "je" : "není");
            System.out.println("Chcete pokračovat? A/N");
            answer = scanner.next().toLowerCase().charAt(0);
        }
        while (answer == 'a');
    }
}
