package lesson1;

import java.util.Scanner;

public class Task_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int arr[] = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        getMin_Max(arr);
    }

    public static void getMin_Max (int array[]) {
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println(min);
        System.out.print(max);
    }
}
