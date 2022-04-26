package data;

import java.util.Arrays;

/**
 * Contains data for cards
 * @author JV
 */
public class DataStore {
    private static final String[] values
            = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

    private static final String[] symbols
            = {"hearts", "clubs", "diamonds", "spades"};

    private static final int[] nPoints
            = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

    private static final int nCards = 9;

    private static final String[] triple = {"jack", "queen", "king"};

    public static String[] loadSymbols() {
        return Arrays.copyOf(symbols, symbols.length);
    }

    public static String[] loadValues() {
        return Arrays.copyOf(values, values.length);
    }

    public static int[] loadNPoints(){
        return Arrays.copyOf(nPoints, nPoints.length);
    }

    public static int getNCards(){
        return nCards;
    }

    public static String[] getTriple(){
        return Arrays.copyOf(triple, triple.length);
    }
}