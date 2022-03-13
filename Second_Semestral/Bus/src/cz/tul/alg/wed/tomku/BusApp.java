package cz.tul.alg.wed.tomku;

import java.util.Scanner;

public class BusApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bus dmplj = new Bus("DPMLJ", 41, 15);

        int vystoupitPax;
        int nastoupitPax;

        for (int i = 1; i < 6; i++) {
            System.out.format("%s. zastávka. %s", i, (i == 5) ? "Konečná! Vystupovat!" : "");
            System.out.println();
            System.out.println(dmplj);
            if (i == 5) {
                dmplj.vystoupitAll();
                System.out.println(dmplj);
                break;
            }
            System.out.println("Zadej kolik lidí chce vystoupit a kolik nastoupit: ");
            vystoupitPax = sc.nextInt();
            nastoupitPax = sc.nextInt();

            dmplj.vystoupit(vystoupitPax);
            dmplj.nastoupit(nastoupitPax);
        }
    }
}
