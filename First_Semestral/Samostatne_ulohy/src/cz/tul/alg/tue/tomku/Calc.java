package cz.tul.alg.tue.tomku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long cislo = 0;
        long count = 0;

        List<Integer> cisla = new ArrayList<>();
        List<Character> operatory = new ArrayList<>();

        cislo = sc.nextLong();

        for (int i = 0; i < cislo; i++) {

            for (int j = 0; j < 100; j++) {
                cisla.set(j,sc.nextInt());
                operatory.set(j, sc.next().charAt(0));
                count++;
                if (operatory.get(j) == '=') break;
            }


            for (int g = 0; g < count; g++) {
                if (operatory.get(g) == '*') {
                    cisla.set(g,cisla.get(g) * cisla.get(g + 1));
                    for (int j = g; j < count; j++) {
                        operatory.set(j, operatory.get(j + 1));
                    }
                    for (int j = (g + 1); j < count; j++) {
                        cisla.set(j, cisla.get(j + 1));
                    }
                    g--;
                } else if (operatory.get(g) == '/') {
                    if (cisla.get(g + 1) != 0) {
                        cisla.set(g, cisla.get(g) / cisla.get(g + 1));
                    } else {
                        cisla.set(g, 0);
                    }
                    for (int j = g; j < count; j++) {
                        operatory.set(j, operatory.get(j + 1));
                    }
                    for (int j = (g + 1); j < count; j++) {
                        cisla.set(j, cisla.get(j + 1));
                    }
                    g--;
                }
            }
            for (int g = 0; g < count; g++) {
                if (operatory.get(g) == '+') {
                    if (operatory.get(g) == '+') {
                        cisla.set(g, cisla.get(g) + cisla.get(g + 1));
                    } else {
                        cisla.set(g, (-cisla.get(g)) + cisla.get(g + 1));
                    }
                    for (int j = g; j < count; j++) {
                        operatory.set(j, operatory.get(j + 1));
                    }
                    for (int j = (g + 1); j < count; j++) {
                        cisla.set(j, cisla.get(j + 1));
                    }
                    g--;
                } else if (operatory.get(g) == '-') {
                    if (g - 1 < 0 || operatory.get(g - 1) == '+') {
                        cisla.set(g, cisla.get(g) - cisla.get(g + 1));
                    } else {
                        cisla.set(g, (-cisla.get(g)) - cisla.get(g + 1));
                    }

                    for (int j = g; j < count; j++) {
                        operatory.set(j, operatory.get(j + 1));
                    }
                    for (int j = (g + 1); j < count; j++) {
                        cisla.set(j, cisla.get(j + 1));
                    }
                    g--;
                }
            }
            System.out.println(cisla.get(0));
        }
    }
}
