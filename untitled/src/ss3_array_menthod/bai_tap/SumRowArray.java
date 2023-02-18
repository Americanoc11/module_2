package ss3_array_menthod.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SumRowArray {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5},
        };
        Scanner input = new Scanner(System.in);
        System.out.println("Enter row want sum");
        int row;
        int sum = 0;
        do {
            row = input.nextInt();
            if (row < 0) {
                System.out.println(" Retype");
            }
        } while (row < 0);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (row == j) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println("Sum: " + sum);
    }
}
