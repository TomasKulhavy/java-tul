package cz.tul.alg.tue.tomku;

import java.util.Locale;
import java.util.Scanner;

public class PrumernaDenniTeplota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        float firstTemp = sc.nextFloat();
        float secondTemp = sc.nextFloat();
        float thirdTemp = sc.nextFloat();

        float prumernaTeplota = (firstTemp + secondTemp + thirdTemp * 2) / 4;

        System.out.format(Locale.US, "%1.2f", prumernaTeplota);
    }
}
