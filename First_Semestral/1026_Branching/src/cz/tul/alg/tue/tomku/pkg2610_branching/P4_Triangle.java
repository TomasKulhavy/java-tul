package cz.tul.alg.tue.tomku.pkg2610_branching;

public class P4_Triangle {
    public static void main(String[] args) {
        int stranaA = 3;
        int stranaB = 4;
        int stranaC = 5;

        boolean triangle = (stranaA + stranaB) > stranaC && (Math.abs(stranaA - stranaB) < stranaC);

        System.out.println("Trojúhelník " + (triangle ? "LZE" : "NELZE") + " sestrojit");
    }
}
