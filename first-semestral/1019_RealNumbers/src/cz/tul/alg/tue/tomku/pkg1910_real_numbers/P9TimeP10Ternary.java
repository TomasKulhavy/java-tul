package cz.tul.alg.tue.tomku.pkg1910_real_numbers;

import java.time.LocalTime;
import java.util.Scanner;

public class P9TimeP10Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadej maximální povolenou rychlost v úseku [km/h]: ");
        int maxSpeed = sc.nextInt();
        System.out.println("Zadej délku úseku v metrech: ");
        int length = sc.nextInt();
        System.out.println("Zadej čas průjezdu ve formátu [HH:mm:ss]: ");
        String timeEnter = sc.next();  //default format: hh:mm:ss
        LocalTime tEnter = LocalTime.parse(timeEnter);
        System.out.println("Zadej čas průjezdu ve formátu [HH:mm:ss]: ");
        String timeExit = sc.next();  //default format: hh:mm:ss
        LocalTime tExit = LocalTime.parse(timeExit);

        int enterSec = tEnter.toSecondOfDay();
        int exitSec = tExit.toSecondOfDay();
        int sec = exitSec - enterSec;

        double speed = (double) (length / sec) * 3.6;
        double overSpeed = 0;
        boolean bylaPrekrocena = speed > maxSpeed;
        if (speed > maxSpeed) {
            overSpeed = speed - maxSpeed;
        }

        System.out.format("Vaše rychlost v měřeném úseku je: %.2f km/h.%n", speed);
        System.out.printf("Maximální rychlost %s km/h %s překročena.%n", maxSpeed, (bylaPrekrocena) ? "byla" : "nebyla"); //Ternární operátor
        System.out.format("Rychlost jste překročili o: %.2f km/h.%n", overSpeed);
        System.out.println("Pokuta za rychlost: " + ((overSpeed > 6) ? ((overSpeed < 19) ? 1500 : 5000) : 0) + " Kč");
    }
}
