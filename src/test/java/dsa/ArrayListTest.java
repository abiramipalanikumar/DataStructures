package dsa;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

// import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class ArrayListTest {
    @Test
    public void shouldReturnArrayDefualtSize() {
        ArrayList array = new ArrayList();
        assertEquals(50, array.size());        
    }

    @Test
    public void insertArrayValues()
    {
        ArrayList array = new ArrayList();
        for(int i = 0; i < 100; i++)
        {
            array.add(i);
        }

        for(int i = 0; i < 100; i++)
        {
            assertEquals(i, array.get(i));
        }

        assertEquals(100, array.size());
    }


    @Test
    public void checkArraySize()
    {
        ArrayList array = new ArrayList();
        for(int i = 0; i < 120; i++)
        {
            array.add(i);
        }

        for(int i = 0; i < 120; i++)
        {
            assertEquals(i, array.get(i));
        }

        assertEquals(150, array.size());
        assertEquals(120, array.length());
    }

    @Test
    public void checkArrayIndexOutOfBoundary()
    {
        ArrayList array = new ArrayList();
        for(int i = 0; i < 120; i++)
        {
            array.add(i);
        }
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            array.get(125);
        });

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            array.get(-1);
        });
    }
}