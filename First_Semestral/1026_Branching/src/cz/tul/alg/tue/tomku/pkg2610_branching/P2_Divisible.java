package cz.tul.alg.tue.tomku.pkg2610_branching;

public class P2_Divisible {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        boolean divisible = a % b == 0;

        //Redundantní alternativa
        boolean divisbile1 = (a % b == 0) ? true : false;

        //Redundantní alternativa
        boolean divisible2;
        if (a % b == 0)
        {
            divisible2 = true;
        }
        else
        {
            divisible2 = false;
        }
        System.out.println(divisible);
    }
}
