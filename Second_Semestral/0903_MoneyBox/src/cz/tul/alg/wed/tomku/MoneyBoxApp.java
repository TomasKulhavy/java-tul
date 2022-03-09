package cz.tul.alg.wed.tomku;

public class MoneyBoxApp {
    public static void main(String[] args) {
        MoneyBox Alice = new MoneyBox("Alice" , 5, 20);
        MoneyBox Bob = new MoneyBox("Bob");
        Bob.putOneCrown();
        Bob.putOneCrown();
        Bob.putTwoCrown();
        Bob.putTwoCrown();
        Bob.putTwoCrown();
        Bob.putMoney(2, 3);

        System.out.format("Alice\t- %s Kč", Alice.sumOfMoneyBox());
        System.out.println();
        System.out.format("Bob\t\t- %s Kč", Bob.sumOfMoneyBox());

        System.out.println();
        System.out.println();

        System.out.println(Alice);
        System.out.println(Bob);
        System.out.println();

        String result = (Alice.isEnough(39))
                ? "Alice si může koupit hamburger"
                : (Bob.isEnough(39))
                    ? "Bob si může koupit hamburger"
                    : (Bob.isEnough(39) && Alice.isEnough(39))
                        ? "Oba si mohou koupit hamburger" : "Nikdo si nemůže koupit hamburger";

        System.out.println(result);
    }
}
