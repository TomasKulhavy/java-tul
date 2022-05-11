package kulhavy.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
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

    public void getBillance() {
        double data = 0.0;
        String[] line;

        try {
            File myObj = new File(bankAccount + ".txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                line = myReader.nextLine().split(",");
                if(line.length > 1) {
                    data += Double.parseDouble(line[1]);
                }
            }
            System.out.println("Bilance uctu: " + data);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void getAccountInfo() {
        String data = "";
        try {
            File myObj = new File(bankAccount + ".txt");
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
        tomas.getAccountInfo();
    }
}
