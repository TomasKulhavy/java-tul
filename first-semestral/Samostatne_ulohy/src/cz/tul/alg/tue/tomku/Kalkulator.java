package cz.tul.alg.tue.tomku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOf = sc.nextInt();

        for (int i = 0; i < numberOf; i++) {
            List<String> priklad = new ArrayList<>();
            String prvek = "";
            do {
                prvek = sc.next();
                priklad.add(prvek);
            } while (!(prvek.equals("=")));
            int temp = 0;
            for (int j = 0; j < priklad.size(); j++) {
                if (j % 2 != 0) {
                    switch (priklad.get(j)) {
                        case "+":
                            temp += Integer.parseInt(priklad.get(j - 1)) + Integer.parseInt(priklad.get(j + 1));
                            priklad.set(j + 1, Integer.toString(temp));
                            priklad.remove(j - 1);
                            priklad.remove(j - 1);
                            break;
                        case "-":
                            temp += Integer.parseInt(priklad.get(j - 1)) - Integer.parseInt(priklad.get(j + 1));
                            break;
                        case "*":
                            temp += Integer.parseInt(priklad.get(j - 1)) * Integer.parseInt(priklad.get(j + 1));
                            break;
                        case "/":
                            temp += Integer.parseInt(priklad.get(j - 1)) / Integer.parseInt(priklad.get(j + 1));
                            break;
                    }
                }
            }

            System.out.println(temp);
        }
    }
}
