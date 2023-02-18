package ss3_array_menthod.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinDismential {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter a element " + (i + 1) + " :");
                array[i][j] = input.nextInt();
            }
        }
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (min > array[i][j]) {
                    min = array[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println("Min: " + min);
    }
}
