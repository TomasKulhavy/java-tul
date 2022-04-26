package utils;

import java.util.ArrayList;
import java.util.List;

import data.DataStore;
import data.Card;

import javax.xml.crypto.Data;

public class Game implements GameInterface {
    private List<Card> cards = new ArrayList<Card>();
    private int size;

    public void shuffleDeck() {
        String[] symbols = DataStore.loadSymbols();
        String[] values = DataStore.loadValues();
        int[] nPoints = DataStore.loadNPoints();
        // All cards are added with its respective rank, suit and point value
        for (int r = 0; r < symbols.length; r++) {
            for (String value : values) {
                Card card = new Card(symbols[r], value, nPoints[r]);
                cards.add(card);
            }
        }
        size = cards.size();
        shuffle(); // shuffle would be called here to display different sequence
        // of cards every run
    }

    public void shuffle() {
        // Repeat the switching step until "k" has decreased to below zero
        for (int k = cards.size() - 1; k > 0; k--) {
            int howMany = k + 1;
            int start = 0;
            int randPos = (int) (Math.random() * howMany) + start;
            Card temp = cards.get(k);
            cards.set(k, cards.get(randPos));
            cards.set(randPos, temp);
        }
        size = cards.size(); // reset the size of the cards so the program can
        // run again
    }

    public String getName() {
        return "Eleven game";
    }

    public int nCards() {
        return DataStore.getNCards();
    }

    public int getDeckSize() {
        return cards.size();
    }

    public String getCardDescriptionAt(int index) {
        return String.format("%s - %s", cards.get(index).getSymbol(), cards.get(index).getValue());
    }

    public boolean anotherPlayIsPossible() {
        return false;
    }

    public boolean playAndReplace(List<Integer> iSelectedCards) {
        return false;
    }

    public boolean isWon() {
        return getDeckSize() == 0;
    }
}
