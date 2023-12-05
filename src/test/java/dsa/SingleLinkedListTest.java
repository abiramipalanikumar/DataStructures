package dsa;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SingleLinkedListTest {

    @Test
    public void testEmptyList() {
        SingleLinkedList list = new SingleLinkedList();
        assertEquals(true, list.isEmpty());
        list.push_front(10);
        assertEquals(false, list.isEmpty());
    }

    @Test
    public void testListSize() {
        SingleLinkedList list = new SingleLinkedList();

        for (int i = 0; i < 10; i++) {
            list.push_back(i);
        }
        assertEquals(10, list.length());
    }

    @Test
    public void testListPush_back() {
        SingleLinkedList list = new SingleLinkedList();
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
        SingleLinkedList list = new SingleLinkedList();
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
        SingleLinkedList list = new SingleLinkedList();

        for (int i = 0; i < 10; i++) {
            list.push_front(i);
        }

        for (int i = 0; i < 10; i++) {
            assertEquals(i, list.pop_back());
        }
    }

    @Test
    public void testListPop_front() {
        SingleLinkedList list = new SingleLinkedList();

        for (int i = 0; i < 10; i++) {
            list.push_back(i);
        }
        for (int i = 0; i < 10; i++) {
            assertEquals(i, list.pop_front());
        }
    }

    @Test
    public void testListget_head() {
        SingleLinkedList list = new SingleLinkedList();

        for (int i = 0; i < 10; i++) {
            list.push_back(i);
        }
        for (int i = 0; i < 10; i++) {

            assertEquals(i, list.get_head());
            list.pop_front();
        }

    }
}
