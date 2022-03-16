package cz.tul.alg.tue.tomku.pkg0911_cycles;

public class P33_Square {
    public static void main(String[] args) {
        int n = 5; // počet řádků
        int m = 3; // počet sloupců

        System.out.println("Čtverec");
        for (int nRow = 1; nRow <= n; nRow++) {
            for (int i = 1; i <= n; i++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }

        System.out.println("\nObdelník");
        for (int nRow = 1; nRow <= n; nRow++) {
            for (int mCol = 1; mCol <= m; mCol++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }
}
