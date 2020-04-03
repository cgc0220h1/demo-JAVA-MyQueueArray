public class MyQueueArray<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private int capacity;
    private E[] elements;
    public int topPointer;
    public int rearPointer;
    private int size;

    public MyQueueArray(int capacity) {
        this.capacity = capacity;
        elements = (E[]) new Object[capacity];
    }

    public MyQueueArray() {
        capacity = DEFAULT_CAPACITY;
        elements = (E[]) new Object[capacity];
    }

    public int size() {
        return size;
    }

    public E getTopPointer() {
        return elements[topPointer];
    }

    public E getRearPointer() {
        return elements[rearPointer];
    }

    public boolean isQueueFull() {
        if (size == capacity) {
            return true;
        }
        return false;
    }

    public boolean isQueueEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public boolean enqueue(E data) {
        if (isQueueFull()) {
            System.out.println("Queue is full!");
            rearPointer = 0;
            return false;
        }
        if (isQueueEmpty()) {
            elements[rearPointer] = data;
        } else {
            elements[++rearPointer] = data;
        }
        size++;
        return true;
    }

    public E dequeue() {
        if (isQueueEmpty()) {
            return null;
        } else {
            if (topPointer == rearPointer) {
                topPointer = 0;
            }
            size--;
            E value = elements[topPointer];
            elements[topPointer++] = null;
            return value;
        }
    }
}
