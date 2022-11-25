package lesson1;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        System.out.print(reminder(number));
    }

    public static String reminder(int num) {
        if (num % 2 == 0) {
            return "YES";
        }

        return "NO";
    }
}
