package lesson9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Task_2 {
    public static void main(String[] args) {
        Account a1 = new Account(0, "aa1", "aa2", 5000);
        Account a2 = new Account(1, "a1a", "2aa", 3000);
        Account a3 = new Account(2, "1aa", "a2z", 4000);

        BankApplication bank1 = new BankApplication("Halyk Bank");

        bank1.addAccount(a1);
        bank1.addAccount(a2);
        bank1.addAccount(a3);

        Account b1 = new Account(0, "aa1", "aa2", 2000);
        Account b2 = new Account(1, "a1a", "2aa", 1000);
        Account b3 = new Account(2, "1aa", "a2z", 3000);

        BankApplication bank2 = new BankApplication("Sber Bank");

        bank2.addAccount(b1);
        bank2.addAccount(b2);
        bank2.addAccount(b3);

        Account c1 = new Account(0, "aa1", "aa2", 8000);
        Account c2 = new Account(1, "a1a", "2aa", 3000);
        Account c3 = new Account(2, "1aa", "a2z", 3550);

        BankApplication bank3 = new BankApplication("Tinkoff");

        bank3.addAccount(c1);
        bank3.addAccount(c2);
        bank3.addAccount(c3);


        ArrayList<BankApplication> allBanks = new ArrayList();

        allBanks.add(bank1);
        allBanks.add(bank2);
        allBanks.add(bank3);

        allBanks.sort(Comparator.comparing(a -> a.getAverageBalance()));

        Collections.reverse(allBanks);

        for (int i = 0; i < allBanks.size(); i++) {
            System.out.println(allBanks.get(i).getBankData());
        }
    }
}
