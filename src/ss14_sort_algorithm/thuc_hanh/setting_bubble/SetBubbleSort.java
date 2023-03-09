package ss14_sort_algorithm.thuc_hanh.setting_bubble;

import java.util.Arrays;

public class SetBubbleSort {
    static void bubbleSort(int[] array){
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

    public static void main(String[] args) {
        int[] array={3,4,1,2,5};
        System.out.println("Before sort");
        System.out.println(Arrays.toString(array));
        System.out.println("After sort");
        bubbleSort(array);
    }
}
