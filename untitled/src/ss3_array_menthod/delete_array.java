package ss3_array_menthod;

import java.util.Arrays;
import java.util.Scanner;

public class delete_array {
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
        System.out.println("Enter a number");
        int number = input.nextInt();
        for (int i = 0; i < array.length; i++) {
        }
    }
}
