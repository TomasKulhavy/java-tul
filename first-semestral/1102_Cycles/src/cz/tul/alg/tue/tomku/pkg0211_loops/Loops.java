package cz.tul.alg.tue.tomku.pkg0211_loops;

public class Loops {
    public static void main(String[] args) {
        int i = 1;
        while (i < 6) {
            System.out.format("\n%s. Ahoj, while", i);
            i++;
        }
        System.out.println("\n/////");
        i = 1;
        do {
            System.out.format("\n%s. Ahoj, do-while", i);
            i++;
        }
        while (i < 6);
        System.out.println("\n/////");
        for (i = 1; i < 6; i++) {
            System.out.format("\n%s. Ahoj, for", i);
        }
    }
}
