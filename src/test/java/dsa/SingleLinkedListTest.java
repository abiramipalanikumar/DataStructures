package dsa;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class SingleLinkedListTest {

    @Test
    public void testEmptyList() {
        SingleLinkedList<Integer> list = new SingleLinkedList<Integer>();
        assertEquals(true, list.isEmpty());
        list.push_front(Integer.valueOf(10));
        assertEquals(false, list.isEmpty());
    }

    @Test
    public void testListSize() {
        SingleLinkedList<Integer> list = new SingleLinkedList<Integer>();

        for (int i = 0; i < 10; i++) {
            list.push_back(Integer.valueOf(i));
        }
        assertEquals(10, list.length());
    }

    @Test
    public void testListPush_back() {
        SingleLinkedList<Integer> list = new SingleLinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.push_back(Integer.valueOf(i));
        }
        assertEquals(10, list.length());

        ArrayList<Integer> array_list = list.toArrayList();
        for (int i = 0; i < 10; i++) {
            assertEquals(array_list.get(i), Integer.valueOf(i));
        }
    }

    @Test
    public void testListPush_front() {
        SingleLinkedList<Integer> list = new SingleLinkedList<Integer>();
        for (int i = 10; i > 0; i--) {
            list.push_front(Integer.valueOf(i));
        }
        assertEquals(10, list.length());

        ArrayList<Integer> array_list = list.toArrayList();
        for (int i = 0; i < 10; i++) {
            assertEquals(array_list.get(i), Integer.valueOf(i + 1));
        }
    }

    @Test
    public void testListPop_back() {
        SingleLinkedList<Integer> list = new SingleLinkedList<Integer>();

        for (int i = 0; i < 10; i++) {
            list.push_front(Integer.valueOf(i));
        }

        for (int i = 0; i < 10; i++) {
            assertEquals(Integer.valueOf(i), list.pop_back());
        }
        assertThrows(NullPointerException.class, () -> {
            list.pop_back();
        });
    }

    @Test
    public void testListPop_front() {
        SingleLinkedList<Integer> list = new SingleLinkedList<Integer>();

        for (int i = 0; i < 10; i++) {
            list.push_back(Integer.valueOf(i));
        }
        for (int i = 0; i < 10; i++) {
            assertEquals(Integer.valueOf(i), list.pop_front());
        }
        assertThrows(NullPointerException.class, () -> {
            list.pop_front();
        });
    }

    @Test
    public void testListget_head() {
        SingleLinkedList<Integer> list = new SingleLinkedList<Integer>();

        assertThrows(NullPointerException.class, () -> {
            list.get_head();
        });

        for (int i = 0; i < 10; i++) {
            list.push_back(Integer.valueOf(i));
        }
        for (int i = 0; i < 10; i++) {

            assertEquals(Integer.valueOf(i), list.get_head());
            list.pop_front();
        }

    }
}
