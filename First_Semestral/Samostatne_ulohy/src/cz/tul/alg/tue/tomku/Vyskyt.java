package cz.tul.alg.tue.tomku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vyskyt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOf = 1;
        numberOf = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numberOf; i++) {
            String arrayOfNo = "";
            arrayOfNo = sc.nextLine();
            if(arrayOfNo.isEmpty())
            {
                arrayOfNo = sc.nextLine();
            }
            String[] numbers = arrayOfNo.split(" ");

            int firstNo = Integer.parseInt(numbers[0]);
            int secondNo = Integer.parseInt(numbers[1]);

            int arraySize = sc.nextInt();
            int cislo = 0;
            boolean isThere = false;

            List<Integer> list = new ArrayList<>();

            for (int j = 0; j < arraySize; j++) {
                cislo = sc.nextInt();
                list.add(cislo);
            }

            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == firstNo) {
                    if (list.size() > 1) {
                        if (list.size() > (j + 1)) {
                            if (list.get(j + 1) == secondNo) {
                                isThere = true;
                                break;
                            }
                        } else if ((j + 1) > list.size()) {
                            isThere = false;
                            break;
                        }
                    } else {
                        isThere = false;
                        break;
                    }
                } else if (list.get(j) != firstNo) {
                    isThere = false;
                }
            }

            sc.nextLine();
            System.out.println(isThere);
        }
    }
}
