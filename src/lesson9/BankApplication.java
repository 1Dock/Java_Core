package lesson9;

import java.util.ArrayList;

public class BankApplication {
    String name;
    ArrayList<Account> accounts = new ArrayList();

    public BankApplication() {
    }

    public BankApplication(String name) {
        this.name = name;
    }

    void addAccount(Account a) {
        accounts.add(a);
    }
    void removeAccount(int i) {
        accounts.remove(i);
    }
    Account getMaxAccount() {
        double maxPrice = 0;
        int indexMaxPrice = 0;

        for (int i = 0; i < accounts.size(); i++) {
            double price = accounts.get(i).getBalance();

            if (maxPrice < price) {
                maxPrice = price;
                indexMaxPrice = i;
            }
        }

        return accounts.get(indexMaxPrice);
    }
    double getAverageBalance() {
        double sumPrice = 0;

        for (int i = 0; i < accounts.size(); i++) {
            sumPrice += accounts.get(i).getBalance();
        }

        return sumPrice / accounts.size();
    }
    double getTotalBalance() {
        double sumPrice = 0;

        for (int i = 0; i < accounts.size(); i++) {
            sumPrice += accounts.get(i).getBalance();
        }

        return sumPrice;
    }
    int totalAccounts() {
        return accounts.size();
    }
    String getBankData() {
        return name+". "+accounts.size()+" sum balance: "+getTotalBalance()+"$; average: "+getAverageBalance()+"$;";
    }
}
