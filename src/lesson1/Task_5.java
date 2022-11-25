package lesson1;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        sumLetters(str1, str2);
    }

    public static void sumLetters(String str1, String str2) {
        int index = str1.indexOf(str2);

        if (index != -1) {
            System.out.print("YES");
        }
        else {
            System.out.print("NO");
        }
    }
}
