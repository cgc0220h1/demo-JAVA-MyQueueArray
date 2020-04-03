import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueArrayTest {
    private MyQueueArray<Integer> listInteger;

    @BeforeEach
    void newList(){
        listInteger = new MyQueueArray<>();
    }

    @DisplayName("Test thêm dữ liệu thành công")
    @Test
    void testEnqueue() {
        listInteger.enqueue(1);
        listInteger.enqueue(2);
        listInteger.enqueue(3);
        listInteger.enqueue(4);
        System.out.println(listInteger.rearPointer);
        System.out.println(listInteger.topPointer);
        int actualSize = listInteger.size();
        assertEquals(4,actualSize);
    }

    @DisplayName("Test rear và top có trỏ về đúng object sau khi enqueue")
    @Test
    void testRearAndTopPointer() {
        listInteger.enqueue(1);
        listInteger.enqueue(2);
        listInteger.enqueue(3);
        listInteger.enqueue(4);
        int actualTop = listInteger.getTopPointer();
        int actualRear = listInteger.getRearPointer();
        assertEquals(1,actualTop);
        assertEquals(4,actualRear);
    }

    @DisplayName("Test đẩy dữ liệu ra và giá trị mà Top Pointer và Rear Pointer trỉ vào")
    @Test
    void dequeue() {
        listInteger.enqueue(1);
        listInteger.enqueue(2);
        listInteger.enqueue(3);
        listInteger.enqueue(4);
        listInteger.dequeue();
        int actualTop = listInteger.getTopPointer();
        int actualRear = listInteger.getRearPointer();
        assertEquals(2,actualTop);
        assertEquals(4,actualRear);
    }
}