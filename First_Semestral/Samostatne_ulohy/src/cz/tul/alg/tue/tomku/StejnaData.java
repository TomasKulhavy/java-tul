package cz.tul.alg.tue.tomku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StejnaData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startInput = 0;

        startInput = sc.nextInt();

        for (int i = 0; i < startInput; i++) {
            List<Integer> cisla = new ArrayList<>();
            List<Integer> cisla2 = new ArrayList<>();
            boolean isCorrect = true;

            int noCisla = sc.nextInt();
            for (int j = 0; j < noCisla; j++) {
                cisla.add(sc.nextInt());
            }

            int noCisla2 = sc.nextInt();
            for (int j = 0; j < noCisla2; j++) {
                cisla2.add(sc.nextInt());
            }

            if (cisla.size() == cisla2.size()) {
                isCorrect = cisla2.containsAll(cisla);
            } else {
                isCorrect = false;
            }
            System.out.format("%s\n", (isCorrect) ? "1" : "0");
        }
    }
}
