package dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class StackTest {
    @Test
    public void pushAndPopTest() {
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        assertEquals(false, stack.isEmpty());

        for (int i = 9; i >= 0; i--) {

            assertEquals(i, stack.top());

            assertEquals(i, stack.pop());
        }

        assertThrows(NullPointerException.class, () -> {
            stack.pop();
        });

        assertEquals(true, stack.isEmpty());
    }

}
