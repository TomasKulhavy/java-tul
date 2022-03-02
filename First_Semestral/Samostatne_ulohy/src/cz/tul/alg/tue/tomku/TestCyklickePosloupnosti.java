package cz.tul.alg.tue.tomku;

import java.util.*;

public class TestCyklickePosloupnosti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOf = sc.nextInt();

        for (int i = 0; i < numberOf; i++) {
            int arraySize = sc.nextInt();
            List<Integer> cisla = new ArrayList<>();

            for (int j = 0; j < arraySize; j++) {
                cisla.add(sc.nextInt());
            }
            int temp = Collections.max(cisla);
            temp += 1;

            int tempPrev = cisla.get(0);
            for (int j = 1; j < cisla.size(); j++) {
                if (cisla.get(j) == tempPrev) {
                    temp = -1;
                    break;
                }
                tempPrev = cisla.get(j);
            }
            System.out.println(temp);
        }
    }
}
