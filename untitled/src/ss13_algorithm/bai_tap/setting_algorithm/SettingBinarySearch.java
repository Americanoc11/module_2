package ss13_algorithm.bai_tap.setting_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SettingBinarySearch {
    static int binarySearch(List<Integer> array, int left, int right, int value) {
        for (int i = 0; i < array.size(); i++) {
            int mid = (left + right) / 2;
            if (value < array.get(mid)) {
                right = mid - 1;
            } else if (value == array.get(mid)) {
                return mid;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {5, 4, 6, 7, 3, 2, 1};
        int left = 0;
        int right = array.length - 1;
        List<Integer> newArray = new ArrayList<>();
        for (int a : array) {
            newArray.add(a);
        }
        System.out.println("Before sort");
        System.out.println(newArray);
        Collections.sort(newArray);
        System.out.println("After sort");
        System.out.println(newArray);
        System.out.println("Find value");
        int key = Integer.parseInt(input.nextLine());
        System.out.println("Index: " + binarySearch(newArray, left, right, key));
    }
}
