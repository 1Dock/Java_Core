package lesson1;

import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int arr[] = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        getUniqueNum(arr);
    }

    public static void getUniqueNum (int array[]) {
        for (int i = 0; i < array.length; i++) {
            int sum = 0;

            for (int n = 0; n < array.length; n++) {
                if (array[i] == array[n]) {
                    sum++;
                }
            }

            if (sum > 1) {
                continue;
            }
            else {
                System.out.print(array[i] + " ");
            }
        }
    }
}
