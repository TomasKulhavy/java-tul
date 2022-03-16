package cz.tul.alg.tue.tomku;

import java.util.Scanner;

public class TabulkaPoradi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pocetRadku = sc.nextInt();
        int pocetSloupcu = sc.nextInt();
        int radek = sc.nextInt();
        int sloupec = sc.nextInt();
        int pozice = sloupec - 1 + (radek - 1) * pocetSloupcu + 1;

        System.out.format("%s", pozice);
    }
}
