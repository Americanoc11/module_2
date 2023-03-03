package ss10_dsa_stack_queue.bai_tap.check_bracket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class CheckString {
    public static String checkBacket(String str) {

        Scanner input = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();
        boolean flag = true;
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stringList.add(String.valueOf(str.charAt(i)));
        }
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).equals("(")) {
                stack.push(stringList.get(i));
            }
            if (stringList.get(i).equals(")")) {
                if (stack.empty()) {
                    flag = false;
                    return "???";
                } else {
                    stack.pop();
                }
            }
        }
        return "Well";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        do {
            System.out.println("Enter a string");
            str = input.nextLine();
            System.out.println(checkBacket(str));
        } while (true);
    }
}
