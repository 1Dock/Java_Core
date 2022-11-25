package lesson1;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        sumLetters(str);
    }

    public static void sumLetters(String str) {
        String strVersa = "";

        for (int i = str.length() - 1; i <= 0; i--) {
            String elementStr = String.valueOf(str.charAt(i));

            strVersa += elementStr;
        }

        if (strVersa == str) {
            System.out.print("YES");
        }
        else {
            System.out.print("NO");
        }
    }
}
