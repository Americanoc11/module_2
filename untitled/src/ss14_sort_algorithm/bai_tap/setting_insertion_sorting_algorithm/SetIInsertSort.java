package ss14_sort_algorithm.bai_tap.setting_insertion_sorting_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class SetIInsertSort {
    static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentValue = array[i];
            int j;
            for (j = i - 1; j >= 0 && array[j] > currentValue; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = currentValue;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter length for array");
        int length= Integer.parseInt(input.nextLine());
        int[] array= new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element "+(i+1)+": ");
            array[i]=Integer.parseInt(input.nextLine());
        }
        System.out.println("Before sort");
        System.out.println(Arrays.toString(array));
        System.out.println("After sort");
        insertSort(array);

    }
}
