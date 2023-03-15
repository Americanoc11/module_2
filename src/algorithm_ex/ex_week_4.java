package algorithm_ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex_week_4 {
    public static void main(String[] args) {
        int[] array = {-1, 150, 190, 170, -1, -1, 160, 180};
        
        for (int i = 0; i < array.length; i++) {
            if (array[i]==-1){
                continue;
            } else {
                for (int j = 0; j < array.length-1; j++) {
                    if (array[j]==-1&& array[j+1]==-1){
                        continue;
                    } else if (array[i]<array[j]){
                        int b= array[i];
                        array[i]=array[j];
                        array[j]=b;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
