package cz.tul.alg.wed.tomku;

import java.util.Arrays;

public class PolynomTools {
    public static Polynom sum(Polynom polynom, Polynom polynom2) {
        int size = (polynom.getLenght() > polynom2.getLenght() ) ? polynom.getLenght()  : polynom2.getLenght() ;
        int[] sum = new int[size];
        sum = Arrays.copyOf(polynom.getPolynom(), polynom.getLenght());

        for (int i = 0; i < polynom2.getLenght(); i++) {
            sum[i] += polynom2.getPolynom()[i];
        }

        return new Polynom(sum);
    }
}
