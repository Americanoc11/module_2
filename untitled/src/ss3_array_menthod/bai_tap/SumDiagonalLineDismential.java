package ss3_array_menthod.bai_tap;

import java.util.Scanner;

public class SumDiagonalLineDismential {
    static int sumDiagonalLine(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sum += array[i][j];
                }
                if (i + j == array.length - 1) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] array = {
                {5, 2, 3, 4},
                {1, 2, 4, 4},
                {1, 4, 3, 4},
                {4, 2, 3, 4},
        };
        System.out.println("Sum diagonalline: " + sumDiagonalLine(array));
    }
}
