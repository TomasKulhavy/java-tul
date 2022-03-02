package cz.tul.alg.tue.tomku.pkg2610_branching;

public class P3_Circle {
    public static void main(String[] args) {
        double bodX = 5;
        double bodY = 7;
        double stredX = 2;
        double stredY = 3;
        double polomer = 7;
        final double PRESNOST = 0.0001;
        boolean onCircle = false;
        boolean inside = false;

        double delkaPS = Math.sqrt(Math.pow(bodX - stredX, 2) + Math.pow(bodY - stredY, 2));

        if (Math.abs((delkaPS - polomer)) < PRESNOST) {
            onCircle = true;
        } else {
            if (delkaPS < polomer) {
                inside = true;
            } else {
                inside = false;
            }
        }

        if (onCircle) {
            System.out.format("Bod leží na kružnici.");
        } else {
            if (inside) {
                System.out.format("Bod leží v kružnici.");
            } else {
                System.out.format("Bod leží mimo kružnici.");
            }
        }
    }
}
