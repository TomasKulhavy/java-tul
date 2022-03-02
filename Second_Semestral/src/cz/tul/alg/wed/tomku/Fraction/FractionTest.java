package cz.tul.alg.wed.tomku.Fraction;

public class FractionTest {
    public static void main(String[] args) {
        Fraction fractionStringFull = new Fraction("33/4");
        Fraction fractionString = new Fraction("33");
        Fraction fractionFull = new Fraction(6, 3);
        Fraction fraction = new Fraction(3);

        System.out.println("x/1 | string");
        System.out.println("Čitatel:\t\t\t" + fractionString.getCitatel());
        System.out.println("Jmenovatel:\t\t\t" + fractionString.getJmenovatel());
        System.out.println("Double hodnota:\t\t" + fractionString.hodnota());
        System.out.println("Textový řetězec:\t" + fractionString);
        System.out.println();
        System.out.println("x/y | string");
        System.out.println("Čitatel:\t\t\t" + fractionStringFull.getCitatel());
        System.out.println("Jmenovatel:\t\t\t" + fractionStringFull.getJmenovatel());
        System.out.println("Double hodnota:\t\t" + fractionStringFull.hodnota());
        System.out.println("Textový řetězec:\t" + fractionStringFull);
        System.out.println();
        System.out.println("x/1 | int");
        System.out.println("Čitatel:\t\t\t" + fraction.getCitatel());
        System.out.println("Jmenovatel:\t\t\t" + fraction.getJmenovatel());
        System.out.println("Double hodnota:\t\t" + fraction.hodnota());
        System.out.println("Textový řetězec:\t" + fraction);
        System.out.println();
        System.out.println("x/y | int");
        System.out.println("Čitatel:\t\t\t" + fractionFull.getCitatel());
        System.out.println("Jmenovatel:\t\t\t" + fractionFull.getJmenovatel());
        System.out.println("Double hodnota:\t\t" + fractionFull.hodnota());
        System.out.println("Textový řetězec:\t" + fractionFull);
    }
}
