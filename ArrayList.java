public class ArrayList<T>
{
    T value;
    T[] list;
    int index = 0, size = 50;

    public ArrayList()
    {
        this.list = (T[])new Object[size];
    }

    public void add(T value)
    {
        if(index == size)
        {
            int temp = size;
            size = size + 50; 
            T[] newList = (T[]) new Object[size];
            for(int i = 0; i < temp; i++)
            {
                newList[i] = list[i];
                this.list = newList;
            }
        }

        list[index] = value;
    }

    public int size()
    {
        return this.index;
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
    }

}