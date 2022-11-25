package lesson1;

import java.util.Scanner;

public class Task_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        getMonth(number);
    }

    public static void getMonth (int num) {
        if (num > 0 && num < 3) {
            System.out.print("Winter");
        }
        else if (num > 2 && num < 6) {
            System.out.print("Spring");
        }
        else if (num > 5 && num < 9) {
            System.out.print("Summer");
        }
        else if (num > 8 && num < 12) {
            System.out.print("Autumn");
        }
    }
}

