package cz.tul.alg.tue.tomku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class George {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> amount = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        List<Integer> cumSum = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        String vstup = "";
        int sum = 0;

        while (!(vstup.equals("q"))) {
            System.out.println("Zadejte platby ve formátu DD.MM.YYYY částka.");
            vstup = sc.nextLine();
            if (vstup.equals("q")) break;
            String datePay = vstup.substring(3, 5);
            String amountPay = vstup.substring(11, vstup.length());

            if (amount.get(Integer.parseInt(datePay) - 1).equals(0)) {
                amount.set(Integer.parseInt(datePay) - 1, Integer.parseInt(amountPay));
            } else {
                int temp = amount.get(Integer.parseInt(datePay) - 1);
                int temp1 = temp + Integer.parseInt(amountPay);
                amount.set(Integer.parseInt(datePay) - 1, temp1);
            }
            System.out.println();
        }

        for (int i = 0; i < amount.size(); i++) {
            sum += amount.get(i);
            cumSum.set(i, sum);
        }

        for (int i = 0; i < amount.size(); i++) {
            sum += amount.get(i);
            System.out.format("\n%s.\t%s Kč\tKumulativní suma: %s Kč", i + 1, amount.get(i), cumSum.get(i));
        }
    }
}
