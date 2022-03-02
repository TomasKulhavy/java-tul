package cz.tul.alg.tue.tomku.pkg0211_loops;

import java.util.Scanner;

public class P28_Dokonale_cislo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char answer = 'n';
        long sum;
        long dokonaleCislo;
        boolean isDokonale;

        do {
            System.out.println("Zadejte číslo: ");
            dokonaleCislo = scanner.nextLong();
            sum = 0;

            for (long i = 1; i <= dokonaleCislo / 2; i++) {

                sum += dokonaleCislo % i == 0 ? i : 0;
            }

            isDokonale = dokonaleCislo == sum;

            System.out.format("Číslo %s %s dokonalé.", dokonaleCislo, isDokonale ? "je" : "není");
            System.out.println("\nChceš pokračovat a/n");
            answer = scanner.next().toLowerCase().charAt(0);
        }
        while(answer == 'a');
    }
}
