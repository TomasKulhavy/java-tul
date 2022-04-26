package data;

public class Card {
    private String symbol;
    private String value;
    private int nPoint;

    public Card(String symbol, String value, int nPoint) {
        this.symbol = symbol;
        this.value = value;
        this.nPoint = nPoint;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getValue() {
        return value;
    }

    public int getnPoint() {
        return nPoint;
    }
}
