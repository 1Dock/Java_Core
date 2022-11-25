package lesson10;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Task_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int nums[] = new int[length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        int sum = IntStream
                .of(nums)
                .sum();

        System.out.println(sum);
    }
}