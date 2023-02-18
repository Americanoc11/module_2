package ss3_array_menthod.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
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
            if (number == array[i]) {
                array[i] = 0;
            }
            if (array[i] == 0) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
            }
        }
        int[] array2 = Arrays.copyOf(array, array.length - 1);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

    }
}
