package ss9_dsa_list.bai_tap.myList;

import java.util.Arrays;

public class MyArrayList<E> {
    //<E> : khai báo kiểu generic -> để truyền đối tượng E vào
    /**
     * số lượng phần tử có trong MyArrayList
     */
    private int size = 0;
    /**
     * Dãy chứa của MyArrayList
     */
    private static final int DEAULT_CAPACITY = 10;
    /**
     * Mảng chứa các phần tử
     */
    Object elements[];

    public MyArrayList() {
        elements = new Object[DEAULT_CAPACITY];

    }

    /**
     * pthuc constructor với sức chứa được truyền vào
     *
     * @param capacity
     */
    public MyArrayList(int capacity) {
        if (capacity > 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Capacity: " + capacity);
        }
    }

    public int getSize() {
        return this.size;
    }

    /**
     * phương thức clean ArrayList
     */
    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    /**
     * Phương thức add 1 phần tử vào MyArrayList
     * nếu độ dài elemnt = size thì tăng độ dài > truyền tham số vào trong
     *
     * @param element
     * @return
     */
    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(1);
        }
        elements[size] = element;
        size++;
        return true;
    }

    public void add(E element, int index) {
        if (index > elements.length) {
            throw new IllegalArgumentException("Index: " + index);
        } else if (elements.length == size) {
            this.ensureCapacity(1);
        }
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }

    /**
     * Phương thức tăng kích ước của MyArrayList
     *
     * @param minCapacity
     */
    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity: " + minCapacity);
        }
    }

    /**
     * Phương thức lấy element tại vị trí index
     *
     * @param index
     * @return
     */
    public E get(int index) {
        return (E) elements[index];
    }

    /**
     * phương thức lấy index của 1 phần tử
     *
     * @param element
     * @return
     */
    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(elements)) {
                return i;
            }
        }
        return index;
    }

    /**
     * phương thức kiểm tra 1 phần tử có trong MyArrayList hay không
     *
     * @param element
     * @return
     */
    public boolean contains(E element) {
        return this.indexOf(element) >= 0;
    }

    /**
     * phương thức tạo ra 1 bản sao của MyArrayList
     *
     * @return
     */
    public MyArrayList<E> clone() {
        MyArrayList<E> v = new MyArrayList<>();
        v.elements = Arrays.copyOf(this.elements, this.size);
        v.size = size;
        return v;
    }

    /**
     * Phương thức xóa phần tử ở vị trí index
     * @param index
     * @return
     */
    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IllegalArgumentException("Error index: " + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i]= elements[i+1];
        }
        elements[size-1]=null;
        size--;
        return element;
    }
}
