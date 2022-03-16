package cz.tul.alg.tue.tomku;

import java.util.Scanner;

public class CtyriCisla {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ulohyNo = sc.nextInt();
        for (int i = 0; i < ulohyNo; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            int n4 = sc.nextInt();

            int odkladani;

            do {
                if (n1 > n2) {
                    odkladani = n1;
                    n1 = n2;
                    n2 = odkladani;
                }
                if (n2 > n3) {
                    odkladani = n2;
                    n2 = n3;
                    n3 = odkladani;
                }
                if (n3 > n4) {
                    odkladani = n3;
                    n3 = n4;
                    n4 = odkladani;
                }
            } while (!(n1 < n2 && n2 < n3 && n3 < n4));

            System.out.format("%s %s %s %s\n", n1, n2, n3, n4);
        }
    }
}
