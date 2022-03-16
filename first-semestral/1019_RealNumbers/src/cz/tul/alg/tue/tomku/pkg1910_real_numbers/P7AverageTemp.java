package cz.tul.alg.tue.tomku.pkg1910_real_numbers;

import java.util.Scanner;

public class P7AverageTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadej teplotu v 6 hodin: ");
        double firstTemp = sc.nextDouble();
        System.out.println("Zadej teplotu ve 12 hodin: ");
        double secondTemp = sc.nextDouble();
        System.out.println("Zadej teplotu v 18 hodin: ");
        double thirdTemp = sc.nextDouble();

        double temp = (firstTemp + secondTemp + thirdTemp * 2) / 4;

        System.out.format("Denní průměrná teplota je: %.2f", temp);
    }
}

/*      Celá čísla vstup, výstup desetinná
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadej teplotu v 6 hodin: ");
        int firstTemp = sc.nextDouble();
        System.out.println("Zadej teplotu ve 12 hodin: ");
        int secondTemp = sc.nextDouble();
        System.out.println("Zadej teplotu v 18 hodin: ");
        int thirdTemp = sc.nextDouble();

        double temp = (double) (firstTemp + secondTemp + thirdTemp*2) / 4;

        System.out.format("Denní průměrná teplota je: %.2f", temp);
 */
