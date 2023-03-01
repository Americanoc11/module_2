package ss10_dsa_stack_queue.bai_tap.reverse;

import java.util.ArrayList;
import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> wStack = new Stack<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        for (Integer arrList : arrayList) {
            stack.push(arrList);
        }
        for (int i = stack.size() - 1; i >= 0; i--) {
            wStack.push(stack.get(i));
        }
        System.out.println(stack);
        System.out.println(wStack);


    }
}
