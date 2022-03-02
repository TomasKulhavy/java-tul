package cz.tul.alg.tue.tomku.pkg2610_branching;

import java.time.LocalDate;
import java.util.Scanner;

public class P14_Year {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        int yearNow = LocalDate.now().getYear();
        System.out.println("Zadejte rok: ");
        year = scanner.nextInt();
        final int DAYS_IN_YEAR = 365;

        boolean leapYear = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
        String when = (yearNow > year) ? (leapYear ? "byl" : "nebyl") : ((yearNow < year) ? (leapYear ? "bude" : "nebude") : leapYear ? "je" : "není");
        int countedYearDays = (leapYear) ? DAYS_IN_YEAR + 1 : DAYS_IN_YEAR;

        System.out.format("Rok %s %s přestupný a má %s dní", year, when, countedYearDays);
    }
}
