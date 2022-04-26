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
        for (int r = 0; r < values.length; r++) {
            for (String symbol : symbols) {
                Card card = new Card(values[r], symbol, nPoints[r]);
                cards.add(card);
            }
        }
        size = cards.size();
        shuffle();
    }

    public void shuffle() {
        for (int k = cards.size() - 1; k > 0; k--) {
            int howMany = k + 1;
            int start = 0;
            int randPos = (int) (Math.random() * howMany) + start;
            Card temp = cards.get(k);
            cards.set(k, cards.get(randPos));
            cards.set(randPos, temp);
        }
        size = cards.size() - 9;
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
        return containsPairSum11(cIndexes) || containsJQK(cIndexes);
    }

    public boolean playAndReplace(List<Integer> iSelectedCards) {
        if (iSelectedCards.size() == 2 && containsPairSum11(iSelectedCards)) {
            for (Integer k : iSelectedCards) {
                deal(k);
            }
            return true;
        } else return iSelectedCards.size() == 3 && containsJQK(iSelectedCards);
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
            return cards.get(size);
        } else
            return null;
    }

    private boolean containsJQK(List<Integer> selectedCards) {
        boolean jack = false;
        boolean queen = false;
        boolean king = false;

        for (Integer deck : selectedCards) {
            int k = deck;

            if (cards.get(k).getValue().equals("jack")) {
                jack = true;
            } else if (cards.get(k).getValue().equals("queen")) {
                queen = true;
            } else if (cards.get(k).getValue().equals("king")) {
                king = true;
            }
        }
        return (jack && queen && king);
    }

    private boolean containsPairSum11(List<Integer> selectedCards) {

        for (int numOne = 0; numOne < selectedCards.size(); numOne++) {
            int num1 = selectedCards.get(numOne);
            for (int numTwo = numOne + 1; numTwo < selectedCards.size(); numTwo++) {
                int num2 = selectedCards.get(numTwo);
                if (cards.get(num1).getnPoint() + cards.get(num2).getnPoint() == 11) {
                    return true;
                }
            }
        }
        return false;
    }

    public List<Integer> cardIndexes() {
        List<Integer> selected = new ArrayList<Integer>();
        for (int k = 0; k < DataStore.getNCards(); k++) {
            if (cards.get(k) != null) {
                selected.add(k);
            }
        }
        return selected;
    }
}
