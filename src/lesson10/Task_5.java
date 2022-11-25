package lesson10;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Task_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int nums[] = new int[length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        IntStream
                .of(nums)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.println(n));
    }
}