package ss13_algorithm.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    /**
     *  Phương thức tìm value, nếu có trả về index, không có trả về -1
     * @param list
     * @param key
     * @return
     */
    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập độ dài cho mảng");
        int lenght = Integer.parseInt(input.nextLine());
        int[] array = new int[lenght];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println("Nhập số bạn muốn tìm");
        int number=Integer.parseInt(input.nextLine());
        System.out.println(Arrays.toString(array));
        System.out.println(binarySearch(array,number));
    }
}
