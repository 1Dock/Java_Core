package lesson1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        max(num1, num2, num3);
    }

    public static void max(int number1, int number2, int number3) {
        int max = 0;

        if (number1 > number2 && number1 > number3) {
            System.out.print(number1);
        }
        else if (number2 > number1 && number2 > number3) {
            System.out.print(number2);
        }
        else if (number3 > number2 && number3 > number1) {
            System.out.print(number3);
        }
    }
}