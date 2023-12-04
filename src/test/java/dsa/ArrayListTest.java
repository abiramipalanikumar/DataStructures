package dsa;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ArrayListTest {
    @Test
    public void shouldReturnArrayDefualtSize() {
        ArrayList array = new ArrayList();
        assertEquals(50, array.size());
    }
}
