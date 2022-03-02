package cz.tul.alg.tue.tomku;

import java.util.*;

public class Maxima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pocetUloh = sc.nextInt();

        for (int i = 0; i < pocetUloh; i++) {
            int max1;
            int max2;
            int max3;
            int max4;
            int cislo;

            List<Integer> list = new ArrayList<>();

            do {
                cislo = sc.nextInt();
                if (cislo <= 0) break;
                list.add(cislo);
            } while (cislo > 0);

            list.sort(Comparator.naturalOrder());
            int size = list.size();
            int i2 = 2;
            max1 = list.get(size - 1);
            max2 = list.get(size - i2);
            while (max1 == max2) {
                i2++;
                max2 = list.get(size - i2);
            }
            int i3 = i2 + 1;
            max3 = list.get(size - i3);
            while (max2 == max3) {
                i3++;
                max3 = list.get(size - i3);
            }
            int i4 = i3 + 1;
            max4 = list.get(size - i4);
            while (max3 == max4) {
                i4++;
                max4 = list.get(size - i4);
            }

            int max1Count = 0;
            int max2Count = 0;
            int max3Count = 0;
            int max4Count = 0;

            for (int j = 0; j < list.size(); j++) {
                if (max1 == list.get(j)) {
                    max1Count++;
                }
                if (max2 == list.get(j)) {
                    max2Count++;
                }
                if (max3 == list.get(j)) {
                    max3Count++;
                }
                if (max4 == list.get(j)) {
                    max4Count++;
                }
            }

            System.out.format("\n%s %s", max1, max1Count);
            System.out.format("\n%s %s", max2, max2Count);
            System.out.format("\n%s %s", max3, max3Count);
            System.out.format("\n%s %s", max4, max4Count);
        }
    }
}
