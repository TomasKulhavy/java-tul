package myLibrary;

import java.util.Scanner;

public class ArrayToolsUI {
    static Scanner sc = new Scanner(System.in);

    public static void show(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void load(int[] a) {
        System.out.println("Zadej prvky pole: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }

    public static int[] load(int n) {
        int[] a = new int [n];
        System.out.println("Zadej prvky pole: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void main(String[] args) {
        int[] b = new int [3];
        System.out.println("Adresa pole: " + load(3)); // výstup je reference na pole
        load(b);
        show(b);
    }

    //VÝSTUP    VSTUP   NA JAKÉM POLI DĚLÁME
    // int[]    int[]   nepracujeme na něm
    // void     int[]   pracujeme přímo na něm
}
