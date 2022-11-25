package lesson1;

import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int arr[] = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print(getSumZero(arr));
    }

    public static int getSumZero (int array[]) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                sum++;
            }
        }

        return sum;
    }
}
