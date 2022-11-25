package lesson1;

import java.util.Scanner;

public class Task_18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int arr[][] = new int[N][M];

        for (int i = 0 ; i < N; i++) {
            for (int n = 0; n < M; n++) {
                arr[i][n] = in.nextInt();
            }
        }

        getMin_Max(arr, N, M);
    }

    public static void getMin_Max(int array[][], int N, int M) {
        for (int i = 0 ; i < N; i++) {
            int max = array[i][0];

            for (int n = 0; n < M; n++) {
                if (array[i][n] > max) {
                    max = array[i][n];
                }
            }

            System.out.println(max);
        }
    }
}