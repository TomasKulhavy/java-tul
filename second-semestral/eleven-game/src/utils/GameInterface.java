package utils;

import java.util.List;

/**
 * Interface between the card game and the UI
 * Defines requested functionality from the game
 * @author JV
 */
public interface GameInterface {
    /**
     * Name of the game such as "Eleven game"
     * @return name of the game
     */
    public String getName();

    /**
     * Number of cards on the table for this game.
     * It will not change during the game. For the Eleven game it is 9.
     * @return number of cards on the table
     */
    public int nCards();

    /**
     * State of the deck
     * For the Eleven game it starts at 43 (52 - 9) and goes down with each new play
     * @return actual number of cards in the deck
     */
    public int getDeckSize();

    /**
     * Text representation of the card to be displayed
     * @param index of the card on the table
     * @return symbol and value of the card as one String e.g. "symbol-value" or
     * or empty String if there is no card at that index
     */
    public String getCardDescriptionAt(int index);

    /**
     * Is another play possible.
     * In Eleven game, another play is possible when on the table there
     * is a pair that sum to 11 or a triple J, Q, K.
     * @return true if is possible, false otherwise
     */
    public boolean anotherPlayIsPossible();

    /**
     * Play and replace selected cards on the table.
     * Can selected cards be played? In Eleven game, is it a pair that sum to 11 or
     * a triple J, Q, K? If so, replace those cards by new cards from the deck.
     * @param iSelectedCards indexes of the selected cards
     * @return true if selected cards can be played, false otherwise
     */
    public boolean playAndReplace(List<Integer> iSelectedCards);

    /**
     * Is the game won.
     * In Eleven game, the game is won when there is no cards on the table
     * neither in the deck. It was possible to create pairs sum to 11 or triples
     * from all cards.
     * @return true if all cards were played successfully, false otherwise
     */
    public boolean isWon();

    /**
     * Shuffle deck
     */
    public void shuffleDeck();
}