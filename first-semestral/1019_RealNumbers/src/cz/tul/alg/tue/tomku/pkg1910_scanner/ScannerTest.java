package cz.tul.alg.tue.tomku.pkg1910_scanner;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej slovo: ");
        String word = sc.next(); //1 slovo
        sc.nextLine(); //nutné napsat pro vymazání bufferu, jinak by mi to vypsalo pouze word
        System.out.println("Zadej větu: ");
        String sentence = sc.nextLine();
        System.out.println(word);
        System.out.println(sentence);
    }
}
