package cz.tul.alg.tue.tomku.pkg0911_cycles;

public class P23_Prvociselny_soucin {
    public static void main(String[] args) {
        String vysledek = "";
        int number = 36;
        int startNumber = number;

        if (number <= 0) {
            vysledek = "Nelze!";
        } else {
            for (int i = 2; i <= number; i++) {
                while (number % i == 0) {
                    number /= i;
                    vysledek += i + " * ";
                }
            }
        }

        System.out.format("Prvnočíselný součin čísla %s je: \n%s = %s", startNumber, vysledek.substring(0,vysledek.length() - 3), startNumber);
    }
}