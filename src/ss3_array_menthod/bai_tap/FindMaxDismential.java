package ss3_array_menthod.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxDismential {
    static int findMax(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array = new int[3][3];
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter a element " + (i + 1) + " :");
                array[i][j] = input.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println("Max: " + findMax(array));
    }
}
