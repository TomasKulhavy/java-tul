package tomku.Fraction;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fraction {
    private Integer jmenovatel;
    private Integer citatel;

    public Fraction(Integer x, Integer y) {
        int delitel = EukliduvAlg(x, y);
        this.citatel = x / delitel;
        this.jmenovatel = y / delitel;
    }

    public Fraction(Integer x) {
        this.citatel = x;
    }

    public Fraction(String string) {
        String test = "(\\d*)[?:\\/\\s]?(?:\\d*)?";
        String test2 = "(\\d*)[\\/\\s](\\d*)";
        Pattern patt = Pattern.compile(test, Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
        Matcher matc = patt.matcher(string);
        Pattern patt2 = Pattern.compile(test2, Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
        Matcher matc2 = patt2.matcher(string);

        if (matc2.find()) {
            int x = Integer.parseInt(matc2.group(1));
            int y = Integer.parseInt(matc2.group(2));
            int delitel = EukliduvAlg(x, y);
            this.citatel = x / delitel;
            this.jmenovatel = y / delitel;
            return;
        }
        if (matc.find() && !(matc2.find())) {
            this.citatel = Integer.parseInt(matc.group(1));
            this.jmenovatel = null;
        }
    }

    public Integer getCitatel() {
        return citatel;
    }

    public Integer getJmenovatel() {
        if (jmenovatel == null) return 1;
        return jmenovatel;
    }

    public double hodnota() {
        if (jmenovatel == null) {
            return citatel;
        } else {
            return (double) citatel / jmenovatel;
        }
    }

    public int EukliduvAlg(int a, int b) {
        if (a < 1 || b < 1) throw new IllegalArgumentException("a or b is less than 1");
        while (b != 0) {
            int tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }

    @Override
    public String toString() {
        if (jmenovatel == citatel) {
            double temp = (double) citatel / jmenovatel;
            return String.format("%s", (int) temp);
        } else if (jmenovatel == null) {
            return String.format("%s", citatel);
        } else {
            return String.format("%s/%s", citatel, jmenovatel);
        }
    }
}
