package dsa;

public class ArrayList {
    int[] list;
    int index, size;

    public ArrayList(int size)
    {
        this.size = size;
        this.index = 0;
        this.list = new int[size];
    }

    public ArrayList()
    {
        this(50);
    }

    public void add(int value)
    {
        if(index == size)
        {
            this.size = this.size + 50;
            int[] newList = new int[size];
            for(int i = 0;i < index; i++)
            {
                newList[i] = list[i];
            }
            this.list = newList;
        }
        list[index++] = value;
    }

    public int get(int index) throws ArrayIndexOutOfBoundsException
    {
        if(index < 0 || index >= this.index)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        return list[index];
    }

    public int length()
    {
        return this.index;
    }

    public int size()
    {
        return this.size;
    }

    public static void main(String[] args)
    {
        ArrayList list = new ArrayList();
        list.add(1);
        System.out.println(list.size());
    }
}
