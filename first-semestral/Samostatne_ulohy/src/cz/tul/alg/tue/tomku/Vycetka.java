package cz.tul.alg.tue.tomku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vycetka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noPlatidla = 0;
        do {
            noPlatidla = sc.nextInt();
            if (noPlatidla <= 0) break;

            long castka;
            List<Integer> platidla = new ArrayList<>();

            for (int i = 0; i < noPlatidla; i++) {
                platidla.add(sc.nextInt());
            }

            do {
                castka = sc.nextLong();
                long temp = castka;
                if (castka <= 0) break;

                for (int i = 0; i < platidla.size(); i++) {
                    System.out.print(castka / platidla.get(i) + " ");
                    castka = castka % platidla.get(i);
                }
                castka = temp;
            } while (castka > 0);
        } while (noPlatidla > 0);
    }
}