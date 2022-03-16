package cz.tul.alg.tue.tomku.pkg0911_cycles;

public class P37_CR_flag {
    public static void main(String[] args) {
        int n = 15;
        int m = Math.round(n * 1.5f);

        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_WHITE = "\u001B[37m";

        for (int nRow = 1; nRow <= n / 2; nRow++) {
            for (int i = 1; i <= nRow; i++) {
                System.out.print(ANSI_BLUE + "@  ");
            }
            for (int i = 1; i <= m - nRow; i++) {
                System.out.print(ANSI_WHITE + "=  ");
            }
            System.out.println("");
        }
        for (int i = 1; i <= m; i++) {
            System.out.print(ANSI_BLUE + "@  ");
        }
        System.out.println("");
        for (int nRowFromBottom = n / 2; nRowFromBottom >= 1; nRowFromBottom--) {
            for (int i = 1; i <= nRowFromBottom; i++) {
                System.out.print(ANSI_BLUE + "@  ");
            }
            for (int i = 1; i <= m - nRowFromBottom; i++) {
                System.out.print(ANSI_RED + "-  ");
            }
            System.out.println("");
        }
    }
}
