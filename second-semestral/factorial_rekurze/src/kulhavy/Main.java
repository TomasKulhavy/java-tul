package kulhavy;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        int[] pole = {0, 12, 45, 100, 3, 123};
        System.out.println(factorial(6));
        System.out.println(findMax(pole, pole.length));
        File file = new File("src");
        System.out.println(listDirectory(file, 0));
    }

    public static int factorial(int n) {
        if (n >= 1) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }

    public static int findMax(int[] a, int n) {
        if (n == 1) {
            return a[0];
        }
        int m = findMax(a, n - 1);
        if (m > a[n - 1]) {
            return m;
        } else {
            return a[n - 1];
        }
    }

    public static String listDirectory(File file, int mezara) {
        StringBuilder s = new StringBuilder();
        StringBuilder mezera = new StringBuilder();
        if (file.exists()) {
            File[] files = file.listFiles();
            mezera.append(" ".repeat(mezara));
            s.append(mezera).append(file.getName()).append("\n");
            if (files != null) {
                for (int i = 0; i < files.length; i++) {
                    s.append(listDirectory(files[i], mezara + 1)).append("\n");
                }
            }
            return s.toString();
        }
        return s.append("Nenalezeno nic!").toString();
    }
}
