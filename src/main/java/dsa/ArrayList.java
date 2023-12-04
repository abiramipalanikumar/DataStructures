package dsa;

public class ArrayList<T> {
    T[] list;
    int index, size;

    @SuppressWarnings("unchecked")
    public ArrayList(int size) {
        this.size = size;
        this.index = 0;
        this.list = (T[]) new Object[size];
    }

    public ArrayList() {
        this(50);
    }

    @SuppressWarnings("unchecked")
    public void add(T value) {
        if (index == size) {
            this.size = this.size + 50;
            T[] newList = (T[]) new Object[size];
            for (int i = 0; i < index; i++) {
                newList[i] = list[i];
            }
            this.list = newList;
        }
        list[index++] = value;
    }

    public T remove(int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= this.index) {
            throw new ArrayIndexOutOfBoundsException();
        }

        T temp = this.get(index);

        this.index -= 1;

        for (int i = index; i < this.index; i++) {
            list[i] = list[i + 1];
        }

        return temp;
    }

    public T get(int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= this.index) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return list[index];
    }

    public boolean contains(T value) {
        for (int i = 0; i < this.index; i++) {
            if (this.get(i) == value) {
                return true;
            }
        }

        return false;
    }

    public int length() {
        return this.index;
    }

    public int size() {
        return this.size;
    }
}
