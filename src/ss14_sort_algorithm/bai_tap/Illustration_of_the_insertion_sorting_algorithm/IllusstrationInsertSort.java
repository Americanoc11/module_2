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
/*
 * 1. Tạo 1 danh sách con luôn luôn đợc duy trùy dưới dạng đã sắp xếp
 * 2. Đầu tiên lấy 1 phần tử
 * 3. Sau đó duyệt phần tử qua danh sách.
 * 4. phần tử được chèn vào vị trí thích hợp sao cho vẫn đảm bảo duy trì thứ tự truyền vào.
 * Độ phứ tạp :
 * - Tối ưu: O(n)
 * - Tệ nhất O(n^2)

 */

