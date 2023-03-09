package ss10_dsa_stack_queue.bai_tap.deciamalChangeBinary;

import java.util.Scanner;
import java.util.Stack;

public class ChangeDecimalBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal ");
        int decimal = Integer.parseInt(input.nextLine());
        int divisor;
        while (decimal != 0) {
            divisor = decimal % 2;
            decimal /= 2;
            stack.push(divisor);
        }
        System.out.println(stack);
    }
}
