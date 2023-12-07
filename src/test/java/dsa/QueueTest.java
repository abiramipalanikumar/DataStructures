package dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class QueueTest {
    @Test
    public void pushAndPopTest() {
        Queue<Integer> queue = new Queue<Integer>();

        for (int i = 0; i < 10; i++) {
            queue.push(i);
        }
        assertEquals(false, queue.isEmpty());

        assertEquals(9, queue.peek());

        for (int i = 0; i < 10; i++) {
            assertEquals(i, queue.pop());
        }

        assertThrows(NullPointerException.class, () -> {
            queue.pop();
        });

        assertEquals(true, queue.isEmpty());
    }

}
