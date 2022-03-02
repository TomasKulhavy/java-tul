package cz.tul.alg.tue.tomku;

import java.util.Scanner;

public class TabulkaPozice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pocetRadku = sc.nextInt();
        int pocetSloupcu = sc.nextInt();
        int pozice = sc.nextInt();
        int sloupec = (pozice - 1) % pocetSloupcu + 1;
        int radek = (pozice - 1) / pocetSloupcu + 1;

        System.out.format("%s %s", radek, sloupec);
    }
}
