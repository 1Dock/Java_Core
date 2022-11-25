package lesson1;

import java.util.Scanner;

public class Task_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int arr[] = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        getNumber(arr);
    }

    public static void getNumber (int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 50 && array[i] % 5 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}

