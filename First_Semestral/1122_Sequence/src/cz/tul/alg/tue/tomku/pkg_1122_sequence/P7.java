package cz.tul.alg.tue.tomku.pkg_1122_sequence;

import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        boolean sorted = true;
        int previous = Integer.MIN_VALUE;

        while ((number = sc.nextInt()) > 0) {
            if (previous >= number) {
                sorted = false;
                break;
            }
            previous = number;
        }

    }
}
