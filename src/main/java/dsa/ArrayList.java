package dsa;

public class ArrayList {
    int value;
    int[] list;
    int index = 0, size = 50;

    public ArrayList()
    {}

    public void add(int value)
    {}

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
