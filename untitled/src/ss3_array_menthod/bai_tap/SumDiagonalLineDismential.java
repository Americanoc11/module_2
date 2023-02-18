package ss3_array_menthod.bai_tap;

import java.util.Scanner;

public class SumDiagonalLineDismential {
    public static void main(String[] args) {
        int[][] array = {
                {5, 2, 3, 4},
                {1, 2, 4, 4},
                {1, 4, 3, 4},
                {4, 2, 3, 4},
        };
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
        System.out.println("Sum diagonalline: " + sum);
    }
}
