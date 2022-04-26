package ui;

import utils.GameInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import utils.Game;

/**
 * UI for card games e.g. Eleven game
 */
public class ConsoleUI {
    public static Scanner sc = new Scanner(System.in);

    private GameInterface game;

    public void start() {
        boolean nextGame = true;
        while (nextGame){
            game = new Game(); //connect UI with the game logic
            playGame();
            System.out.println("Chceš hrát znova? a/n");
            nextGame = sc.next().equalsIgnoreCase("a");
        }
    }

    private void playGame(){
        System.out.println("***************** "+ game.getName() + " ********************");
        displayDeck();
        displayCards();
        while(game.anotherPlayIsPossible()){
            System.out.println("Vyběr karty:");
            String[] selectedCards = sc.nextLine().split(" +"); //separator is one or more spaces
            List<Integer> iSelectedCards = toInt(selectedCards); //changes String positions to int indexes
            if (game.playAndReplace(iSelectedCards)){
                displayDeck();
                displayCards();
            } else {
                System.out.println("Nevalidní tah");
            }
        }
        if (game.isWon()){
            System.out.println("Gratuluju!");
        } else {
            System.out.println("Nelze hrát");
        }
    }

    private void displayCards() {
        for (int i = 0; i < game.nCards(); i++) {
            System.out.format("%1d. %10s   ", i+1, game.getCardDescriptionAt(i));
            System.out.println("");
        }
    }

    private void displayDeck() {
        System.out.println("V balicku je " + game.getDeckSize() + " karet");
    }

    private List<Integer> toInt(String[] selectedCards) {
        List<Integer> iSelectedCards = new ArrayList();
        for (int i = 0; i < selectedCards.length; i++) {
            iSelectedCards.add(Integer.parseInt(selectedCards[i])-1);
        }
        return iSelectedCards;
    }
}