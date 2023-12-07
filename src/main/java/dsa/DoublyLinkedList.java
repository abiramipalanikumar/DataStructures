package dsa;

public class DoublyLinkedList<T> {

    class Node<Y> {
        T data;
        Node<T> next;
        Node<T> prev;

        Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node<T> head;
    Node<T> tail;

    int length = 0;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void push_front(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.next = this.head;
        if (!this.isEmpty()) {
            this.head.prev = newNode;
        } else {
            this.tail = newNode;
        }
        this.head = newNode;
        this.length++;
    }

    public void push_back(T data) {
        Node<T> newNode = new Node<T>(data);
        if (this.isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.prev = this.tail;
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.length++;
    }

    public T pop_back() throws NullPointerException {
        if (this.isEmpty()) {
            throw new NullPointerException();
        }

        Node<T> prev = tail.prev;
        Node<T> temp = tail;
        if (prev == null) {
            this.head = null;
        } else {
            prev.next = null;
        }
        this.tail = prev;
        this.length--;
        return temp.data;
    }

    public T pop_front() throws NullPointerException {
        if (this.isEmpty()) {
            throw new NullPointerException();
        }
        Node<T> temp = this.head;
        this.head = this.head.next;
        if (this.head != null)
            this.head.prev = null;
        this.length--;
        return temp.data;
    }

    public T get_head() throws NullPointerException {
        if (this.isEmpty()) {
            throw new NullPointerException();
        }
        return head.data;
    }

    public ArrayList<T> toArrayList() {
        ArrayList<T> list = new ArrayList<T>();
        Node<T> temp = head;
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }
        return list;
    }

    public int length() {
        return this.length;
    }

    public boolean isEmpty() {
        return this.head == null;
    }
}
