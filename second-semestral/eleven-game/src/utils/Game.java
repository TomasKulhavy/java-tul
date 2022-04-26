package utils;

import java.util.List;
import data.DataStore;

public class Game implements GameInterface {

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int nCards() {
        return 0;
    }

    @Override
    public int getDeckSize() {
        return 0;
    }

    @Override
    public String getCardDescriptionAt(int index) {
        return null;
    }

    @Override
    public boolean anotherPlayIsPossible() {
        return false;
    }

    @Override
    public boolean playAndReplace(List<Integer> iSelectedCards) {
        return false;
    }

    @Override
    public boolean isWon() {
        return false;
    }
}
