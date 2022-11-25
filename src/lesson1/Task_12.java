package lesson1;

import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.next();

        getDuplicateLetters(text);
    }

    public static void getDuplicateLetters (String word) {
        for (int i = 0; i < word.length(); i++) {
            String letter = String.valueOf(word.charAt(i));

            System.out.print(letter);
            System.out.print(letter);
        }
    }
}