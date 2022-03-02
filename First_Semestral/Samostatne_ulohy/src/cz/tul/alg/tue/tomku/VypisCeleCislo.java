package cz.tul.alg.tue.tomku;

import java.util.Scanner;

public class VypisCeleCislo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String num = "";
        if (number >= 0) {
            num = "+";
        } else if (number < 0) {
            num = "-";
        }
        String numberInString = String.valueOf((Math.abs(number)));
        if (numberInString.length() == 1) {
            num += "00";
        } else if (numberInString.length() == 2) {
            num += "0";
        }
        num += numberInString;

        System.out.println(num);
    }
}
