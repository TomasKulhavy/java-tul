package cz.tul.alg.tue.tomku.pkg0911_cycles;

public class P35_Triangle {
    public static void main(String[] args) {
        int n = 5;

        System.out.println("\nTrojúhelník");
        for (int nRow = 1; nRow <= n; nRow++) {
            for (int i = 1; i <= n - nRow; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= nRow; i++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
