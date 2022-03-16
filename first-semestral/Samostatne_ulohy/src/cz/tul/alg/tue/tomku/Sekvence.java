package cz.tul.alg.tue.tomku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sekvence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startInput = 0;

        do {
            int countOfNo = 1;
            int previousCount = 0;
            startInput = sc.nextInt();
            if (startInput <= 0) break;

            List<Integer> cisla = new ArrayList<>();

            for (int i = 0; i < startInput; i++) {
                cisla.add(sc.nextInt());
            }

            int previousInt = cisla.get(0);

            for (int i = 1; i < cisla.size(); i++) {
                if ((previousInt) <= cisla.get(i)) {
                    previousInt = cisla.get(i);
                    countOfNo++;
                } else {
                    previousInt = cisla.get(i);
                    if (countOfNo > previousCount) {
                        previousCount = countOfNo;
                    }
                    countOfNo = 1;
                }
            }

            if (previousCount > countOfNo) {
                countOfNo = previousCount;
            }

            System.out.println(countOfNo);
        } while (startInput > 0);
    }
}
