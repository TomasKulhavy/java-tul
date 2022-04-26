package ui;

/**
 * Runs GUI or ConsolaUI
 */
public class GameRunner {

    public static void main(String[] args) {
        ConsoleUI game = new ConsoleUI();
        //GUI game = new GUI();
        game.start();
    }
}