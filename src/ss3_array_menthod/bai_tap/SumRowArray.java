package ss3_array_menthod.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SumRowArray {
    static int sumRow(int[][] array, int row) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][row];
        }
        return sum;
    }

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
        System.out.println(Arrays.deepToString(array));
        System.out.println("Sum: " + sumRow(array,row));
    }
}
