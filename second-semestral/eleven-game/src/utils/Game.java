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
        for (int r = 0; r < values.length; r++) {
            for (String symbol : symbols) {
                Card card = new Card(values[r], symbol, nPoints[r]);
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
        size = cards.size() - 9; // reset the size of the cards so the program can
        // run again
    }

    public String getName() {
        return "Eleven game";
    }

    public int nCards() {
        return DataStore.getNCards();
    }

    public int getDeckSize() {
        return size;
    }

    public String getCardDescriptionAt(int index) {
        return String.format("%s - %s", cards.get(index).getSymbol(), cards.get(index).getValue());
    }

    public boolean anotherPlayIsPossible() {
        List<Integer> cIndexes = cardIndexes();
        // One of the remover methods have to be true for this method to return
        // true
        if (containsPairSum11(cIndexes) || containsJQK(cIndexes)) {
            return true;
        }
        return false; // If return false, the game is over and the player lost
    }

    public boolean playAndReplace(List<Integer> iSelectedCards) {
        if (iSelectedCards.size() == 2 && containsPairSum11(iSelectedCards)) {
            for (Integer k : iSelectedCards) {
                deal(k.intValue());
            }
            return true;
        } else if (iSelectedCards.size() == 3 && containsJQK(iSelectedCards)){
            return true;
        } else {
            return false;
        }
    }

    public boolean isWon() {
        return getDeckSize() == 0;
    }

    private void deal(int k) {
        cards.set(k, dealCard());
    }

    private Card dealCard() {
        if (size > 0) {
            size--;
            Card dealt = cards.get(size); // size will decrease by one each time
            // to get the next card
            return dealt;
        } else
            return null;
    }

    private boolean containsJQK(List<Integer> selectedCards) {
        boolean jack = false;
        boolean queen = false;
        boolean king = false;

        // Scan through the selected cards to check if they match the criteria
        for (Integer deck : selectedCards) {
            int k = deck.intValue();

            if (cards.get(k).getValue().equals("jack")) {
                jack = true;
            } else if (cards.get(k).getValue().equals("queen")) {
                queen = true;
            } else if (cards.get(k).getValue().equals("king")) {
                king = true;
            }
        }
        return (jack && queen && king); // Returns true if all of them are
        // present
    }

    private boolean containsPairSum11(List<Integer> selectedCards) {

        for (int numOne = 0; numOne < selectedCards.size(); numOne++) {
            int num1 = selectedCards.get(numOne).intValue(); // get the value
            // for the first
            // card
            for (int numTwo = numOne + 1; numTwo < selectedCards.size(); numTwo++) {
                int num2 = selectedCards.get(numTwo).intValue(); // get the
                // value for
                // the
                // second
                // card
                // check if the two cards adds up to 11
                if (cards.get(num1).getnPoint() + cards.get(num2).getnPoint() == 11) {
                    return true;
                }
            }
        }
        return false;
    }

    public List<Integer> cardIndexes() {
        List<Integer> selected = new ArrayList<Integer>();
        for (int k = 0; k < cards.size(); k++) {
            if (cards.get(k) != null) {
                selected.add(new Integer(k));
            }
        }
        return selected;
    }
}
