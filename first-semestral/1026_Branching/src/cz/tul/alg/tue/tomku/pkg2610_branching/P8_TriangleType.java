package cz.tul.alg.tue.tomku.pkg2610_branching;

import java.lang.reflect.Array;
import java.util.Arrays;

public class P8_TriangleType {
    public static void main(String[] args) {
        double stranaA = 33.9;
        double stranaB = 24;
        double stranaC = 24;
        double s = 0;
        double St = 0;
        double ot = 0;
        double ta = 0;
        double tb = 0;
        double tc = 0;
        double[] strany = {stranaA, stranaB, stranaC};
        Arrays.stream(strany).sorted();

        boolean triangle = (stranaA + stranaB) > stranaC && (Math.abs(stranaA - stranaB) < stranaC);

        System.out.println("Trojúhelník " + (triangle ? "LZE" : "NELZE") + " sestrojit");

        if (triangle) {
            s = (stranaA + stranaB + stranaC) / 2;
            St = Math.sqrt(s * (s - stranaA) * (s - stranaB) * (s - stranaC));
            ot = stranaA + stranaB + stranaC;
            ta = Math.sqrt(2 * (Math.pow(stranaB, 2)) + 2 * (Math.pow(stranaC, 2)) - Math.pow(stranaA, 2));
            tb = Math.sqrt(2 * (Math.pow(stranaA, 2)) + 2 * (Math.pow(stranaC, 2)) - Math.pow(stranaB, 2));
            tc = Math.sqrt(2 * (Math.pow(stranaA, 2)) + 2 * (Math.pow(stranaB, 2)) - Math.pow(stranaC, 2));

            System.out.format("Délky těžnic jsou: \n > Ta: %.2f cm\n > Tb: %.2f cm\n > Tc: %.2f cm", ta, tb, tc);
            System.out.format("\nObsah trojúhelníku je %.2f cm2 a Obvod trojúhelníku je %.2f cm", St, ot);
            boolean rovnoramenny = stranaA == stranaB || stranaB == stranaC || stranaA == stranaC;
            if (stranaA == stranaB && stranaB == stranaC && stranaA == stranaC) {
                System.out.println("\nToto je rovnostranný trojúhelník.");
            } else if (Math.pow(strany[0], 2) == Math.pow(strany[1], 2) + Math.pow(strany[2], 2) && rovnoramenny) {
                System.out.println("\nToto je rovnoramenný pravoúhlý trojúhelník.");
            } else if (stranaA == stranaB || stranaB == stranaC || stranaA == stranaC) {
                System.out.println("\nToto je rovnoramenný trojúhelník.");
            } else if (Math.pow(strany[0], 2) == Math.pow(strany[1], 2) + Math.pow(strany[2], 2)) {
                System.out.println("\nToto je pravoúhlý trojúhelník.");
            }
        }

    }
}
