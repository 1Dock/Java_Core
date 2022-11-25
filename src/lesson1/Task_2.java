package lesson1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        max(num1, num2, num3);
    }

    public static void max(int number1, int number2, int number3) {
        if (number1 + number2 > number3 && number2 + number3 > number1 && number3 + number1 > number2) {
            System.out.print("YES");
        }
        else {
            System.out.print("NO");
        }
    }
}
