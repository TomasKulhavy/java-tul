package cz.tul.alg.tue.tomku;

import java.util.Scanner;

public class PrevodSekund {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secSum = sc.nextInt();

        final int SECONDS_IN_HOUR = 3600; //konstanta
        final int SECONDS_IN_MINUTES = 60;
        final int MINUTES_IN_HOURS = 60;

        int hours = secSum / SECONDS_IN_HOUR;
        int minutes = (secSum % SECONDS_IN_HOUR) / MINUTES_IN_HOURS;
        int sec = (secSum % SECONDS_IN_HOUR) % SECONDS_IN_MINUTES;

        System.out.println(String.format("%02d:%02d:%02d", hours, minutes, sec));
    }
}
