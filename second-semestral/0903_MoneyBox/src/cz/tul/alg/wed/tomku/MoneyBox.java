package cz.tul.alg.wed.tomku;

public class MoneyBox {
    private String nameOfOwner;
    private int noOfOnes;
    private int noOfTwos;

    public MoneyBox(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
        this.noOfOnes = 0;
        this.noOfTwos = 0;
    }

    public MoneyBox(String nameOfOwner, int noOfOnes, int noOfTwos) {
        this.nameOfOwner = nameOfOwner;
        this.noOfOnes = noOfOnes;
        this.noOfTwos = noOfTwos;
    }

    public void changeName(String name) {
        this.nameOfOwner = name;
    }

    public int sumOfMoneyBox() {
        return this.noOfOnes + (2 * this.noOfTwos);
    }

    public void putOneCrown() {
        putOneCrown(1);
    }

    public void putTwoCrown() {
        putTwoCrown(1);
    }

    public void putOneCrown(int count) {
        this.noOfOnes += count;
    }

    public void putTwoCrown(int count) {
        this.noOfTwos += count;
    }

    public void putMoney(int ones, int twos) {
        putOneCrown(ones);
        putTwoCrown(twos);
    }

    public boolean isEnough(int amount) {
        return sumOfMoneyBox() >= amount;
    }

    // TODO
    public void giveMoney() {

    }

    @Override
    public String toString() {
        return String.format("%s má v pokladničce\t- %sKč | %sx 1Kč - %sx 2Kč.", this.nameOfOwner, sumOfMoneyBox(), this.noOfOnes, this.noOfTwos);
    }
}
