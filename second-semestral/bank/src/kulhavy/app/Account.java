package kulhavy.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class Account {
    private Transaction transaction;
    private int bankAccount;

    public Account(int bankAccount) {
        this.bankAccount = bankAccount;
        try {
            File myObj = new File(bankAccount + ".txt");
            if (myObj.createNewFile()) {
                System.out.println("Ucet vytvoren: " + myObj.getName());
            } else {
                System.out.println("Byli jste prihlaseni.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void addTransaction(LocalDate date, double amount) {
        Transaction transaction = new Transaction(date, amount);
        transaction.saveTransaction(bankAccount);
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void getAccountInfo(Account account) {
        String data = "";
        try {
            File myObj = new File(account.bankAccount + ".txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Account tomas = new Account(1);
        tomas.addTransaction(LocalDate.now(), 4000.0);
        tomas.getAccountInfo(tomas);
    }
}
