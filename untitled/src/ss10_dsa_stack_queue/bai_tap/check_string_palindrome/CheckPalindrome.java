package ss10_dsa_stack_queue.bai_tap.check_string_palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CheckPalindrome {
    public static void main(String[] args) {
        Stack<Character> charStack = new Stack<>();
        Queue<Character> charQueue = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();
        System.out.println(str.length());
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            charStack.push(str.toLowerCase().charAt(i));
            charQueue.add(str.toLowerCase().charAt(i));
        }
        System.out.println(charStack.size());
        for (int i = 0; i < str.length(); i++) {
            if (!(charStack.peek() == charQueue.peek())) {
                flag = false;
                break;
            } else {
                charStack.pop();
                charQueue.remove();
            }
        }
        if (flag) {
            System.out.println("Is a string palindrome");
        } else {
            System.out.println("Is not a string palindrome");
        }
    }
}
