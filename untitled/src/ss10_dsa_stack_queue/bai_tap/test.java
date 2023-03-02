package ss10_dsa_stack_queue.bai_tap;

import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr = {2, 4, 4,2,5};
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && j != i) {
                    flag= true;
                }
            }
            if (flag){
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
}
