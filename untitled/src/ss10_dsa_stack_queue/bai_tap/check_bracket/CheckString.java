package ss10_dsa_stack_queue.bai_tap.check_bracket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class CheckString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();
        String str;
        do {
            Stack<String> stack = new Stack<>();
            System.out.println("Enter string");
            str = input.nextLine();
            for (int i = 0; i < str.length(); i++) {
                stringList.add(String.valueOf(str.charAt(i)));
            }
            for (int i = 0; i < stringList.size(); i++) {
                if (stringList.get(i).equals("(")) {
                    stack.push(stringList.get(i));
                }
                if (stringList.get(i).equals(")")) {
                    if (stack.empty()) {
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (stack.empty()) {
                System.out.println("Well");
            } else {
                System.out.println("???");
            }
        } while (true);
    }
}
