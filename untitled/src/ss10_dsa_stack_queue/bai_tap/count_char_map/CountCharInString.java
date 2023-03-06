package ss10_dsa_stack_queue.bai_tap.count_char_map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountCharInString {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = input.nextLine();
        String[] newStr = string.toUpperCase().split(" ");
        for (String element : newStr) {
            if (treeMap.containsKey(element)) {
                int count = treeMap.get(element);
                treeMap.put(element, count + 1);
            } else {
                treeMap.put(element, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            String word = entry.getKey();
            int count1 = entry.getValue();
            System.out.println(word + ": " + count1);
        }
    }
}
