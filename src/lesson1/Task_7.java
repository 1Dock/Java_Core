package lesson1;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int arr[] = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        average(arr, length);
    }

    public static void average(int array[], int length) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.print(sum/length);
    }
}
