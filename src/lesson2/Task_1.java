package lesson2;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String model = in.next();
        int price = in.nextInt();

        Phone h1 = new Phone(name, model, price);
        System.out.println(h1.getData());

        Phone h2 = new Phone();
        System.out.print(h2.getData());
    }
}
