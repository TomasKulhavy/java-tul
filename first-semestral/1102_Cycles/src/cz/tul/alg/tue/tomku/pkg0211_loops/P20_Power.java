package cz.tul.alg.tue.tomku.pkg0211_loops;

import java.util.Scanner;

public class P20_Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadajte číslo, které chcete umocnit: ");
        double number = scanner.nextDouble();
        System.out.println("Zadejte mocninu: ");
        int power = scanner.nextInt();
        double result = 1;

        if (power < 0) {
            for (int i = 0; i > power; i--) {
                result = result * number;
            }
            result = 1 / result;
        } else if (number == 0 && power == 0) {
            result = Double.NaN;
        } else {
            for (int i = 0; i < power; i++) {
                result = result * number;
            }
        }

        System.out.format("%.2f^%s = %.2f", number, power, result);
    }
}
