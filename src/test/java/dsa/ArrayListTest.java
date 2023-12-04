package dsa;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

// import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class ArrayListTest {
    @Test
    public void shouldReturnArrayDefualtSize() {
        ArrayList<Integer> array = new ArrayList<Integer>();
        assertEquals(50, array.size());        
    }

    @Test
    public void insertArrayValues()
    {
         ArrayList<Integer> array = new ArrayList<Integer>();;
        for(int i = 0; i < 100; i++)
        {
            array.add(i);
        }

        for(int i = 0; i < 100; i++)
        {
            assertEquals((Integer)i, array.get(i));
        }

        assertEquals(100, array.size());
    }


    @Test
    public void checkArraySize()
    {
         ArrayList<Integer> array = new ArrayList<Integer>();;
        for(int i = 0; i < 120; i++)
        {
            array.add(i);
        }

        for(int i = 0; i < 120; i++)
        {
            assertEquals((Integer)i, array.get(i));
        }

        assertEquals(150, array.size());
        assertEquals(120, array.length());
    }

    @Test
    public void checkArrayIndexOutOfBoundary()
    {
         ArrayList<Integer> array = new ArrayList<Integer>();;
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

    @Test
    public void removeArrayOutOfBoudsException()
    {
         ArrayList<Integer> array = new ArrayList<Integer>();;
        
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            array.remove(0);
        });

        for(int i = 0; i < 120; i++)
        {
            array.add(i);
        }
        
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            array.remove(125);
        });

    }

    @Test
    public void removeArray()
    {
         ArrayList<Integer> array = new ArrayList<Integer>();;
        
       
        for(int i = 0; i < 120; i++)
        {
            array.add(i);
        }

        for(int i = 0; i < 120; i++)
        {
           assertEquals((Integer)i, array.remove(0));
        }

        for(int i = 0; i < 120; i++)
        {
            array.add(i);
        }

        for(int i = 100; i >= 0; i--)
        {
           assertEquals((Integer)i, array.remove(i));
        }

    }

    @Test
    public void contains()
    {
         ArrayList<Integer> array = new ArrayList<Integer>();;
        
       
        for(int i = 0; i < 120; i++)
        {
            array.add(i);
        }

        for(int i = 0; i < 120; i++)
        {
           assertEquals(true, array.contains(i));
        }

    }
}