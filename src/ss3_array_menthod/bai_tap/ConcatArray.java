package ss3_array_menthod.bai_tap;

import java.util.Arrays;

public class ConcatArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        int[] array = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            array[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            array[arr1.length + j] = arr2[j];
        }
        System.out.println(Arrays.toString(array));
    }
}
