package cz.tul.alg.tue.tomku.pkg2610_branching;

public class P15_BirthNubmer {
    public static void main(String[] args) {
        String part1 = "011209";
        int part1int = Integer.parseInt(part1);
        int part2 = 2739;
        long rc = (long) part1int * 10000 + part2;
        long nineDigits = rc / 10;
        long remainder = nineDigits % 11;
        boolean valid = false;
        long lastDigit = rc % 10;

        if (remainder == 10) {
            if (lastDigit == 0) {
                valid = true;
            }
        } else if (lastDigit == remainder) {
            valid = true;
        }

        String validString = (valid) ? "je" : "není";

        System.out.format("Rodné číslo %s/%s %s platné.", part1, part2, validString);
    }
}
