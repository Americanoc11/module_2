package ss10_dsa_stack_queue.thuc_hanh.impelement_stack_use_linkedList;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    public LinkedList<T> stack;
    public MyGenericStack(){
        stack= new LinkedList<>();
    }

    /**
     * Thêm phần tử vào đầu
     * @param element
     */
    public void push(T element) {
        stack.addFirst(element);
    }

    /**
     * Lấy ra xem và xóa
     * @return
     */
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    /**
     * Trả về length
     * @return
     */
    public int size() {
        return stack.size();
    }

    /**
     * Kiểm tra list có trống không
     * @return
     */
    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}
