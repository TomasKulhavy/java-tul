package kulhavy.ui;

import kulhavy.app.Account;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean login = false;
        int bankNo = 0;
        Account account = null;

        do {
            try {
                System.out.println("============================================");
                System.out.println("Zadejte cislo uctu: [0 - Vypnout program]");
                bankNo = sc.nextInt();
                if (bankNo == 0) {
                    break;
                } else {
                    login = true;
                }
                account = new Account(bankNo);
            } catch (UnsupportedOperationException e) {
                System.out.println(e.getMessage());
            }

            do {
                try {
                    System.out.println("============================================");
                    System.out.println("1 - Zapsat vklad");
                    System.out.println("2 - Zapsat vydaj");
                    System.out.println("0 - Odhlasit se");
                    int temp = sc.nextInt();

                    switch (temp) {
                        case 1:
                            System.out.println("Zadejte rok vkladu: ");
                            int year = sc.nextInt();
                            System.out.println("Zadejte mesic vkladu: ");
                            int month = sc.nextInt();
                            System.out.println("Zadejte den vkladu: ");
                            int day = sc.nextInt();
                            System.out.println("Zadejte castu vkladu: ");
                            double amount = sc.nextDouble();
                            LocalDate date = LocalDate.of(year, month, day);
                            if (account != null) {
                                account.addTransaction(date, amount);
                            }
                            break;
                        case 2:

                        case 0:
                            System.out.println("Byli jste odhlášeni.");
                            quit = true;
                        default:
                            System.out.println("Nedefinovana akce!");
                    }

                } catch (UnsupportedOperationException e) {
                    System.out.println(e.getMessage());
                }
            } while(!quit);
        } while (login);
    }
}
