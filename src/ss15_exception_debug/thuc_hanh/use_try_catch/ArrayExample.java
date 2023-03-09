package ss15_exception_debug.thuc_hanh.use_try_catch;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: " );
        for (int i = 0; i < 10; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i]+ " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample= new ArrayExample();
        Integer[] arr= arrayExample.createRandom();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = Integer.parseInt(input.nextLine());
        try{
            System.out.println("Value have 5"+x+": "+arr[x]);
        }catch (Exception ex){
            System.out.println("Index out bounds exception");
        }
    }
}
