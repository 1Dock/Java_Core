package lesson1;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int arr[] = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print(average(arr));
    }

    public static int average(int array[]) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 != 0) {
                sum += array[i];
            }
        }

        return sum;
    }
}
