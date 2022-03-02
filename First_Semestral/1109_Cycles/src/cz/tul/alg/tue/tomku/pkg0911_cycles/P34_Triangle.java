package cz.tul.alg.tue.tomku.pkg0911_cycles;

public class P34_Triangle {
    public static void main(String[] args) {
        int n = 3;

        System.out.println("\nPravoúhlý trojúhelník");
        for (int nRow = 1; nRow <= n; nRow++) {
            for (int i = 1; i <= nRow; i++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }
}
