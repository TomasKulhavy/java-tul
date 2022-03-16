package cz.tul.alg.tue.tomku.pkg1910_real_numbers;

public class P20Vectors {
    public static void main(String[] args) {
        double ux = 1;
        double uy = 2;
        double uz = 4;
        double vx = 4;
        double vy = 2;
        double vz = 1;

        double delkaU = Math.sqrt(Math.pow(ux, 2) + Math.pow(uy, 2) + Math.pow(uz, 2));
        double delkaV = Math.sqrt(Math.pow(vx, 2) + Math.pow(vy, 2) + Math.pow(vz, 2));
        double skalar = ux * vx + uy * vy + uz * vz;
        double wx = uy * vz - uz * vy;
        double wy = uz * vx - ux * vz;
        double wz = ux * vy - uy * vx;
        double uhel = Math.toDegrees(Math.acos(skalar / (delkaU * delkaV)));

        System.out.format("Délka vektoru U: %.2f%n", delkaU);
        System.out.format("Délka vektoru V: %.2f%n", delkaV);
        System.out.format("Skalární součin: %s%n", skalar);
        System.out.format("Vektorový součin: W=(%s,%s,%s)%n", wx, wy, wz);
        System.out.format("Úhel vektorů: %.2f\u00BA%n", uhel);
    }
}
