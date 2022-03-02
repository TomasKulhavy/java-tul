package cz.tul.alg.tue.tomku.matrix;

import java.util.Scanner;

public class MatrixUI {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean end = false;

        do {
            displayMenu();
            int choice = sc.nextInt();
            switch (choice) {
                case 1: soucetMatic(); break;
                case 2: soucinMatic(); break;
                case 3: normovaniMatic(); break;
                case 4: stochastickaMatice(); break;
                case 5: generovaniPexesa(); break;
                case 6: kontrolaPexesa(); break;
                case 0: end = true; break;
                default: System.out.println("Neplatný vstup!");
            }
        } while (!end);
    }

    private static void kontrolaPexesa() {
        int[][] a = loadMatrixPexeso();
        boolean isPexeso = MatrixTools.isPexeso(a);
        print(a);
        System.out.format("Toto %s PEXESO.", (isPexeso) ? "je" : "není");
    }

    private static void generovaniPexesa() {
        boolean isCorrect = true;
        int rows, columns;
        do {
            System.out.println("Násobek šířky a výšky musí být sudý!");
            System.out.print("Zadej šířku pexesa: ");
            columns = sc.nextInt();
            System.out.print("Zadej výšku pexesa: ");
            rows = sc.nextInt();
            if(!((rows * columns) % 2 == 0)) isCorrect = false;
        } while (isCorrect == false);
        int[][] a = MatrixTools.generatePexeso(rows, columns);
        System.out.println("Vygenerované pexeso");
        print(a);
    }

    private static void stochastickaMatice() {
        double[][] a = loadMatrix();
        boolean isStochastic = MatrixTools.isStochasticMatrix(a);
        print(a);
        System.out.format("Tato matice %s stochastická.", (isStochastic) ? "je" : "není");
    }

    private static void normovaniMatic() {
        double[][] a = loadMatrix();
        double[][] result = MatrixTools.normalMatrix(a);
        print(result);
    }

    private static void soucetMatic() {
        double[][] a = loadMatrix();
        double[][] b = loadMatrix();
        double[][] result = MatrixTools.sum(a, b);
        print(result);
    }

    private static void soucinMatic() {
        double[][] a = loadMatrix();
        double[][] b = loadMatrix();
        double[][] result = MatrixTools.multiply(a, b);
        print(result);
    }

    private static double[][] loadMatrix() {
        System.out.println("Zadej rozměry matice: ŘÁDKY/SLOUPCE: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        double[][] matrix = new double[m][n];
        System.out.println("Zadej hodnoty matice po řádcích: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }

        return matrix;
    }

    private static int[][] loadMatrixPexeso() {
        boolean isCorrect = true;
        int m, n = 0;
        int[][] matrix;
        do {
            System.out.println("Zadej rozměry matice: ŘÁDKY/SLOUPCE: ");
            m = sc.nextInt();
            n = sc.nextInt();
            matrix = new int[m][n];
            if (!((m * n) % 2 == 0)) isCorrect = false;
            isCorrect = true;
        } while(isCorrect == false);
        System.out.println("Nejmenší hodnota musí být nula!");
        System.out.println("Zadej hodnoty matice po řádcích: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    public static void print(double[][] a) {
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.format("%6.2f", a[i][j]);
            }
            System.out.println();
        }
    }

    public static void print(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.format("%4d", a[i][j]);
            }
            System.out.println();
        }
    }

    public static void displayMenu() {
        System.out.println("\n\n1 - Součet matic");
        System.out.println("2 - Součin matic");
        System.out.println("3 - Normování matic");
        System.out.println("4 - Stochastická matice");
        System.out.println("5 - Generování pexesa");
        System.out.println("6 - Kontrola pexesa");
        System.out.println("0 - EXIT");
    }
}
