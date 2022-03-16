package cz.tul.alg.tue.tomku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pocet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pocetUkolu = sc.nextInt();

        for (int i = 0; i < pocetUkolu; i++) {
            int delitelePrvnihoCisla = 0;
            int deliteleVListu = 0;
            int pocetDelitelu = 0;
            int cislo;
            List<Integer> list = new ArrayList<>();
            do {
                cislo = sc.nextInt();
                if (cislo <= 0) break;
                list.add(cislo);
            } while (cislo > 0);

            for (int j = 2; j < list.get(0); j++) {
                if (list.get(0) % j == 0) {
                    delitelePrvnihoCisla++;
                }
            }
            for (int j = 1; j < list.size(); j++) {
                deliteleVListu = 0;
                for (int k = 2; k < list.get(j); k++) {
                    if (list.get(j) % k == 0) {
                        deliteleVListu++;
                    }
                }
                if (delitelePrvnihoCisla == deliteleVListu) {
                    pocetDelitelu++;
                }
            }

            System.out.println(pocetDelitelu);
        }
    }
}
