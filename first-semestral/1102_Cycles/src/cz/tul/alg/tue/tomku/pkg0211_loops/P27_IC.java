package cz.tul.alg.tue.tomku.pkg0211_loops;

import java.util.Scanner;

public class P27_IC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte IČ pro kontrolu platnosti: ");
        int ic = sc.nextInt(); //TUL IČ: 46747885
        int sedmIc = ic / 10;
        int result = 0;
        int cisloZIc = 0;
        int zbytek = 0;
        int posledniCislo = ic % 10;

        for (int a = 2; a <= 8; a++) {
            cisloZIc = sedmIc % 10;
            sedmIc = sedmIc / 10;
            result = result + (cisloZIc * a);
        }
        zbytek = result % 11;
        boolean isValid = (posledniCislo == 11 - zbytek || (posledniCislo == 0 && zbytek == 1) || (posledniCislo == 1 && zbytek == 0)) ? true : false;

        System.out.format("Zadané IČ: %s %s platné.", ic, isValid ? "je" : "není");
    }
}
