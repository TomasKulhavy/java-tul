package myLibrary;

public class NumberTools {
    /**
     * Check whether the given number is prime
     *
     * @param number - given number
     * @return true, if the given numver is prime, check otherwise
     */
    public static boolean isPrime(int number) {
        boolean prime = true;
        if (number < 2) {
            prime = false;

        } else {
            int sqrtNum = (int) (Math.sqrt(number));
            for (int i = 2; prime && i <= sqrtNum; i++) {
                if (number % i == 0) {
                    prime = false;
                }
            }
        }

        return prime;
    }

    public static double Cosinus(double x, double eps) {
        int n = 2;
        double part = 1;
        double cos = part;
        while (Math.abs(part) >= eps) {
            part = (-1) * part * Math.pow(x, 2) / ((n - 1) * n);
            cos = cos + part;
            n += 2;
        }
        return cos;
    }

    public static int generateNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}