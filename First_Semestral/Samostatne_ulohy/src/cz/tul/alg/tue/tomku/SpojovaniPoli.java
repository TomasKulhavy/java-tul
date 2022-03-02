package cz.tul.alg.tue.tomku;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SpojovaniPoli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startInput = 0;

        do {
            startInput = sc.nextInt();
            if (startInput <= 0) break;

            List<Integer> cisla = new ArrayList<>();
            List<Integer> cisla2 = new ArrayList<>();

            for (int i = 0; i < startInput; i++) {
                cisla.add(sc.nextInt());
            }

            startInput = sc.nextInt();
            if (startInput <= 0) break;

            for (int i = 0; i < startInput; i++) {
                cisla2.add(sc.nextInt());
            }
            cisla.addAll(cisla2);
            Collections.sort(cisla);
            System.out.println(cisla);
        } while (startInput > 0);
    }
}
