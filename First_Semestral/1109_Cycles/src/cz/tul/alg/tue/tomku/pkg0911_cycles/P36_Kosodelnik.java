package cz.tul.alg.tue.tomku.pkg0911_cycles;

public class P36_Kosodelnik {
    public static void main(String[] args) {
        int w = 10;
        int h = 7;

        for (int nRow = 1; nRow <= h; nRow++) {
            for (int i = 1; i <= h - nRow; i++) {
                System.out.print(" ");
            }
            for (int mCol = 1; mCol <= w; mCol++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }
}
