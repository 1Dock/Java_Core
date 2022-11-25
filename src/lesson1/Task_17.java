package lesson1;

import java.util.Scanner;

public class Task_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        String operator = in.next();

        getMin_Max(number1, number2, operator);
    }

    public static void getMin_Max (int num1, int num2, String operator) {
        switch (operator) {
            case "/":
                System.out.print(num1 / num2);
                break;
            case "*":
                System.out.print(num1 * num2);
                break;
            case "-":
                System.out.print(num1 - num2);
                break;
            case "+":
                System.out.print(num1 + num2);
                break;
        }
    }
}
