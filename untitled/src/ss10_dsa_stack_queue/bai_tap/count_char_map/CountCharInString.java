package ss10_dsa_stack_queue.bai_tap.count_char_map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountCharInString {
    public static void main(String[] args) {
        Map<Integer, String> entry = new TreeMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = input.nextLine();
        String[] newStr = string.toUpperCase().split(" ");
        for (int i = 0; i < newStr.length; i++) {
            entry.put((i + 1), newStr[i]);
        }
        for (Map.Entry<Integer, String> entrys : entry.entrySet()) {
            System.out.println("Key: " + entrys.getKey() + ", value: " + entrys.getValue());
        }
    }
}
