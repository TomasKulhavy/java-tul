package cz.tul.alg.wed.tomku;

import java.util.Arrays;

public class Polynom {
    private int[] polynom;


    // Konstruktor
    public Polynom(int[] pole) {
        polynom = Arrays.copyOf(pole, pole.length);
    }

    public Polynom(int n1) {
        polynom = new int[1];
        polynom[0] = n1;
    }

    public Polynom(int n1, int n2) {
        polynom = new int[2];
        polynom[0] = n1;
        polynom[1] = n2;
    }

    // Tovární metody
    public static Polynom getInstanceFromReverted(int... a) {
        int[] b = new int[a.length];
        for (int i = a.length - 1; i >= 0 ; i--) {
            b[a.length - i - 1] = a[i];
        }

        return new Polynom(b);
    }

    public static Polynom getInstanceFromNonReverted(int... a) {
        return new Polynom(a);
    }

    public static Polynom getInstanceFromRevertedArray(int[] a) {
        return getInstanceFromReverted(a);
    }

    public static Polynom getInstanceFromNonRevertedArray(int[] a) {
        return new Polynom(a);
    }

    public int[] getPolynom() {
        return Arrays.copyOf(polynom, polynom.length);
    }

    public int getKoef(int exponent) {
        return polynom[exponent];
    }

    public Polynom derivation() {
        int[] temp = new int[polynom .length- 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = polynom[i + 1] * (i + 1);
        }
        return new Polynom(temp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < polynom.length; i++) {
            sb.append(String.format(" %sx^%s", (polynom[i] > 0) ? (i == 0) ? polynom[i] : "+ " + polynom[i] : "- " + Math.abs(polynom[i]), polynom.length - i - 1));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Polynom p0 = Polynom.getInstanceFromReverted(2, 3, 4, 5);
        Polynom p1 = Polynom.getInstanceFromNonReverted(-2, 3, 4, 5);

        System.out.println(p0);
        System.out.println(p1);

        System.out.println(p0.derivation());
    }
}
