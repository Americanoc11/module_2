package ss9_dsa_list.thuc_hanh.implement_linkedList_basic;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListController {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        Queue<String> stringQueue= new LinkedList<>();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addFirst(0);
        list.add(3,5);
        list.printList();

    }
}
