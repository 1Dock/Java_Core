package lesson1;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int arr[][] = new int[length][length];

        for (int i = 0 ; i < arr.length; i++) {
            for (int n = 0; n < arr.length; n++) {
                arr[i][n] = in.nextInt();
            }
        }

        versa(arr, length);
    }

    public static void versa(int array[][], int length) {
        int temp[][] = new int[length][length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                temp[i][j] = array[0][j];
                array[0][j] = array[length - 1][j];
                array[length - 1][j] = temp[0][j];

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
