package dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class DoublyLinkedListTest {

    @Test
    public void testEmptyList() {
        DoublyLinkedList list = new DoublyLinkedList();
        assertEquals(true, list.isEmpty());
        list.push_front(10);
        assertEquals(false, list.isEmpty());
    }

    @Test
    public void testListSize() {
        DoublyLinkedList list = new DoublyLinkedList();

        for (int i = 0; i < 10; i++) {
            list.push_front(i);
        }
        assertEquals(10, list.length());
    }

    @Test
    public void testListPush_back() {
        DoublyLinkedList list = new DoublyLinkedList();
        for (int i = 0; i < 10; i++) {
            list.push_back(i);
        }
        assertEquals(10, list.length());

        ArrayList<Integer> array_list = list.toArrayList();
        for (int i = 0; i < 10; i++) {
            assertEquals(array_list.get(i), Integer.valueOf(i));
        }
    }

    @Test
    public void testListPush_front() {
        DoublyLinkedList list = new DoublyLinkedList();
        for (int i = 10; i > 0; i--) {
            list.push_front(i);
        }
        assertEquals(10, list.length());

        ArrayList<Integer> array_list = list.toArrayList();
        for (int i = 0; i < 10; i++) {
            assertEquals(array_list.get(i), Integer.valueOf(i + 1));
        }
    }

    @Test
    public void testListPop_back() {
        DoublyLinkedList list = new DoublyLinkedList();

        for (int i = 0; i < 10; i++) {
            list.push_front(i);
        }

        for (int i = 0; i < 10; i++) {
            assertEquals(i, list.pop_back());
        }

        assertThrows(NullPointerException.class, () -> {
            list.pop_back();
        });
    }

    @Test
    public void testListPop_front() {
        DoublyLinkedList list = new DoublyLinkedList();

        for (int i = 0; i < 10; i++) {
            list.push_back(i);
        }
        for (int i = 0; i < 10; i++) {
            assertEquals(i, list.pop_front());
        }
        assertThrows(NullPointerException.class, () -> {
            list.pop_front();
        });
    }

    @Test
    public void testListget_head() {
        DoublyLinkedList list = new DoublyLinkedList();

        assertThrows(NullPointerException.class, () -> {
            list.get_head();
        });

        for (int i = 0; i < 10; i++) {
            list.push_back(i);
        }
        for (int i = 0; i < 10; i++) {
            assertEquals(i, list.get_head());
            list.pop_front();
        }

    }

}
