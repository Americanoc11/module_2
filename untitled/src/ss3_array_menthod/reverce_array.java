package ss3_array_menthod;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class reverce_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a length");
        int length = input.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a element " + (i + 1) + " :");
            array[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int b = array[i];
                    array[i] = array[j];
                    array[j] = b;
                }
            }
        }
        System.out.println("Reverse Array: " + Arrays.toString(array));
    }
}
