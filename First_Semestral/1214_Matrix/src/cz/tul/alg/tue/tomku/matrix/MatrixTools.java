package cz.tul.alg.tue.tomku.matrix;

import java.util.Random;

public class MatrixTools {
    public static void print(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.format("%4d", a[i][j]);
            }
            System.out.println();
        }
    }

    public static double[][] sum(double[][] a, double[][] b) {
        if (!(a.length == b.length && a[0].length == b[0].length)) {
            throw new IllegalArgumentException("Nevhodné velikosti matic");
        }
        double[][] sum = new double[a.length][a[0].length];
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }

    public static double[][] multiply(double[][] a, double[][] b) {
        if (!(a[0].length == b.length)) {
            throw new IllegalArgumentException("Nevhodné velikosti matic");
        }
        double[][] multi = new double[a.length][b[0].length];
        double sum;

        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[i].length; j++) {
                sum = 0;
                for (int k = 0; k < b.length; k++) {
                    sum += a[i][k] * b[k][j];
                }
                multi[i][j] = sum;
            }
        }
        return multi;
    }

    public static double[][] normalMatrix(double[][] a) {
        double[][] norm = new double[a.length][a[0].length];
        double max = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (Math.abs(a[i][j]) > max) {
                    max = Math.abs(a[i][j]);
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (Math.abs(a[i][j]) > max) {
                    norm[i][j] = a[i][j] / max;
                }
            }
        }

        return norm;
    }

    public static boolean isSymetricMainDiag(double[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i][j] != a[j][i]) return false;
            }
        }
        return true;
    }

    public static boolean isSymetricSideDiag(double[][] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a[i].length - 1 - i; j++) {
                if (a[i][j] != a[a.length - 1 - j][a[i].length - 1 - i]) return false;
            }
        }
        return true;
    }

    public static boolean isSymetricHorizontal(double[][] a) {
        for (int i = 0; i < a.length / 2; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != a[a.length - 1 - i][j]) return false;
            }
        }
        return true;
    } // Horizontální osa

    public static boolean isSymetricVertical(double[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length / 2; j++) {
                if (a[i][j] != a[i][a[i].length - 1 - j]) return false;
            }
        }
        return true;
    } // Vertikální osa

    /**
     * ÚKOL
     * cvičení 7
     * úlohy 4, 7, 8
     */

    public static boolean isStochasticMatrix(double[][] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < 0) return false;
                sum += a[i][j];
            }
            if (sum != 1) return false;
            sum = 0;
        }
        return true;
    }

    // TODO
    public static boolean isUTMatrix(double[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i][j] != a[j][i]) return false;
            }
        }
        return true;
    }

    public static int[][] generatePexeso(int rows, int columns) {
        int[][] a = new int[rows][columns];
        int maxValue = rows * columns / 2;
        int x, y;

        Random rand = new Random();

        for (int i = 1; i < maxValue; i++) {
            for (int j = 0; j < 2; j++) {
                x = rand.nextInt(columns);
                y = rand.nextInt(rows);

                while (a[y][x] != 0) {
                    x++;
                    if (x == columns) {
                        x = 0;
                        y++;
                    }
                    if (y == rows) y = 0;
                }
                a[y][x] = i;
            }
        }
        return a;
    }

    public static boolean isPexeso(int[][] pexeso) {
        int noOfValues = pexeso.length * pexeso[0].length;
        int maxValue = noOfValues / 2;
        int[] noOfMaxedValues = new int[maxValue];
        int value;
        for (int i = 0; i < pexeso.length; i++) {
            for (int j = 0; j < pexeso[i].length; j++) {
                if (pexeso[i][j] > maxValue) return false;
                value = pexeso[i][j];
                noOfMaxedValues[value] += 1;
            }
        }

        for (int i = 0; i < noOfMaxedValues.length; i++) {
            if (noOfMaxedValues[i] != 2) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] b = {{1, 1, 2, 2},
                {3, 4, 3, 4},
                {0, 5, 5, 0}};
        System.out.println(isPexeso(b));
    }
}
