package cz.tul.alg.tue.tomku.average5k;

import java.util.Scanner;

public class KulhavyTomasAverage5K {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double time = 0.0;
        double SumKmTimes = 0.0;
        double average = 0.0;
        double oneKmTime = 0.0;
        double minTime = Double.MAX_VALUE;
        double maxTime = 0.0;
        int runNo = 0;

        System.out.println("Zadejte čas 5 km běhu v minutách. Pro ukončení zadávání časů, stiskněte 0 nebo zadejte záporné číslo.");

        do {
            time = scanner.nextDouble();
            if (time > 0.0) {
                oneKmTime = time / 5;
                SumKmTimes += oneKmTime;
                runNo++;
                if(oneKmTime > maxTime) {
                    maxTime = oneKmTime;
                }
                if(oneKmTime < minTime) {
                    minTime = oneKmTime;
                }
            }
        } while (time > 0.0);
        
        SumKmTimes -= minTime;
        SumKmTimes -= maxTime;
        runNo -= 2;
        average = SumKmTimes / runNo;

        System.out.format("Průměrný čas na 1 km je: %.2f min\n", average);
    }
}
