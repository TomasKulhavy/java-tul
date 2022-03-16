package cz.tul.alg.wed.tomku;

import java.util.Arrays;

public class PolynomTools {
    public static Polynom sum(Polynom polynom, Polynom polynom2) {
        int size = (polynom.getPolynom().length > polynom2.getPolynom().length ) ? polynom.getPolynom().length  : polynom2.getPolynom().length ;
        int[] sum = new int[size];
        sum = Arrays.copyOf(polynom.getPolynom(), polynom.getPolynom().length);

        for (int i = 0; i < polynom2.getPolynom().length; i++) {
            sum[i] += polynom2.getPolynom()[i];
        }

        return new Polynom(sum);
    }
}
