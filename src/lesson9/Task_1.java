package lesson9;

import java.util.ArrayList;

public class Task_1 {
    public static void main(String[] args) {
        ArrayList<Players> players = new ArrayList();

        Players a1 = new Players("aaa1", 10000, 14);
        Players a2 = new Players("aa1a", 5000, 24);
        Players a3 = new Players("a1aa", 7000, 34);
        Players a4 = new Players("1aaa", 1000, 14);
        Players a5 = new Players("aa11", 9000, 23);
        Players a6 = new Players("a11a", 3000, 20);
        Players a7 = new Players("11aa", 6000, 27);
        Players a8 = new Players("a111", 2000, 25);
        Players a9 = new Players("111a", 3500, 17);
        Players a10 = new Players("1a1a", 7500, 18);

        players.add(a1);
        players.add(a2);
        players.add(a3);
        players.add(a4);
        players.add(a5);
        players.add(a6);
        players.add(a7);
        players.add(a8);
        players.add(a9);
        players.add(a10);

        double sumPrice = 0;
        int sumAge = 0;

        for (int i = 0; i < players.size(); i++) {
            sumPrice += players.get(i).getPrice();
            sumAge += players.get(i).getAge();
        }
        System.out.println("average price: "+sumPrice/players.size()+"; sum age: "+sumAge);
    }
}
