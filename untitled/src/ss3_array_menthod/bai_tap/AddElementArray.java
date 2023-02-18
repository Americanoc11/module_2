package ss3_array_menthod.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {10, 4, 6, 7, 8};
        int[] array2 = Arrays.copyOf(array, array.length + 1);
        System.out.println("Enter a number");
        int num = input.nextInt();
        System.out.println("Enter a index add element");
        int index = input.nextInt();
        for (int i = array2.length - 1; i >= index; i--) {
            array2[i] = array2[i - 1];
        }
        array2[index] = num;
        System.out.println(Arrays.toString(array2));
    }
}

