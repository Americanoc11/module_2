package ss14_sort_algorithm.bai_tap.Illustration_of_the_insertion_sorting_algorithm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class IllusstrationInsertSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {5, 4, 3, 1, 2, 6, 7};
        System.out.println("Before sort");
        System.out.println(Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            int currentValue = array[i];
            int j;
            for (j = i - 1; j >= 0 && array[j] > currentValue; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = currentValue;
        }
        System.out.println("After sort");
        System.out.println(Arrays.toString(array));
    }
}
