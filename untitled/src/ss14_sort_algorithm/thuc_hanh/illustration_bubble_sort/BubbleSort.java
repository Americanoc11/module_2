package ss14_sort_algorithm.thuc_hanh.illustration_bubble_sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array={5,1,3,4,2};
        boolean flag = true;
        for (int i = 0; i < array.length-1&& flag; i++) {
            flag= false;
            for (int j = 0; j <array.length-i-1 ; j++) {
                if (array[j]>array[j+1]){
                    int b = array[j];
                    array[j]= array[j+1];
                    array[j+1]=b;
                    flag= true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
