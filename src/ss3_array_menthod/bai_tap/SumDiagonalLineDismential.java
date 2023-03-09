package ss3_array_menthod.bai_tap;

import java.util.Scanner;

public class SumDiagonalLineDismential {
    static int sumDiagonalLine(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
           sum+=array[i][i];
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
