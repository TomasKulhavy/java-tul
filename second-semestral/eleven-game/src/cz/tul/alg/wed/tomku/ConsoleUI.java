package cz.tul.alg.wed.tomku;

import java.util.Scanner;

public class ConsoleUI {
    Scanner sc = new Scanner(System.in);
    Game game;

    public void start() {
        boolean nextGame = true;
            while (nextGame) {
                game = new Game();
                playGame();
                System.out.println("Chceš hrát znovu? A/N");
                nextGame = sc.next().equalsIgnoreCase("a");
            }
    }

    public void playGame() {
        System.out.println("Vítej ve hře " + game.getName() + "!");
        displayDeck();
        displayCards();

        System.out.println("Vyber karty: ");
        String[] selectedCards = sc.nextLine().split(" +");

        if(game.playAndReplace)
    }
}
