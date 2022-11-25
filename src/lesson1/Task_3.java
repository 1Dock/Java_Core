package lesson1;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String letters = in.next();

        sumLetters(str, letters);
    }

    public static void sumLetters(String str, String let) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            String elementStr = String.valueOf(str.charAt(i));

            if (elementStr.equalsIgnoreCase(let)) {
                sum++;
            }
        }

        System.out.print(sum);
    }
}
