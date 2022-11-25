package lesson1;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String login = in.next();
        String password = in.next();

        average(login, password);
    }

    public static void average(String log, String pass) {
        String login = "admin";
        String password = "qwerty";

        if (log == login && pass == password) {
            System.out.print("Authentication completed");
        }
        else {
            System.out.print("Invalid login or password");
        }
    }
}
