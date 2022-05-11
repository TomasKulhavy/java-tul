package kulhavy.app;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Transaction {
    private LocalDate date;
    private double amount;

    public Transaction(LocalDate date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    public void saveTransaction(int bankAccount) {
        try {
            FileWriter myWriter = new FileWriter(bankAccount + ".txt", true);
            myWriter.write("\n" + date + "," + amount);
            myWriter.close();
            if (amount > 0) {
                System.out.println("Provedli jste vklad");
            } else if (amount < 0) {
                System.out.println("Provedli jste vyber");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
