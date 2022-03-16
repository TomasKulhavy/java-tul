package cz.tul.alg.wed.tomku;

import java.util.Arrays;

public class Polynom {
    private int[] polynom;

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

    public static Polynom getInstanceFromReverted(int... a) {
        int[] b = new int[a.length];
        for (int i = a.length; i > 0 ; i--) {
            b[i] = a[a.length - i - 1];
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < polynom.length; i++) {
            sb.append(String.format(" %sx^%s", (polynom[i] > 0 && i != 0) ? "+" + polynom[i] : polynom[i], polynom.length - i - 1));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] intArray = new int[]{ 1,-2,3,4,5,6,7,8,9,10 };

        Polynom polynom = new Polynom(2, 3);
        Polynom polynomArray = new Polynom(intArray);

        System.out.println(polynom);
        System.out.println(polynomArray);
    }
}
