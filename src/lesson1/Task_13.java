package lesson1;

import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.next();

        System.out.print(getSumVowels(text));
    }

    public static int getSumVowels (String word) {
        int sum = 0;

        for (int i = 0; i < word.length(); i++) {
            String letter = String.valueOf(word.charAt(i));

            if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o") || letter.equalsIgnoreCase("u") || letter.equalsIgnoreCase("y")) {
                sum++;
            }
        }

        return sum;
    }
}