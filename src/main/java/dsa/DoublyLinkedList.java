package dsa;

public class DoublyLinkedList {
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;
    Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void push_front(int data) {
        Node newNode = new Node(data);
        newNode.next = this.head;
        if (!this.isEmpty()) {
            this.head.prev = newNode;
        } else {
            this.tail = newNode;
        }
        this.head = newNode;

    }

    public void push_back(int data) {
        Node newNode = new Node(data);
        if (this.isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.prev = this.tail;
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }

    public int pop_back() throws NullPointerException {
        if (this.isEmpty()) {
            throw new NullPointerException();
        }
        Node temp = head, prev = null;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        if (prev != null)
            prev.next = null;

        return temp.data;
    }

    public int pop_front() throws NullPointerException {
        if (this.isEmpty()) {
            throw new NullPointerException();
        }
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head != null)
            this.head.prev = null;
        return temp.data;
    }

    public int get_head() throws NullPointerException {
        if (this.isEmpty()) {
            throw new NullPointerException();
        }
        return head.data;
    }

    public ArrayList<Integer> toArrayList() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Node temp = head;
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }
        return list;
    }

    public int length() {
        Node temp = this.head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    public boolean isEmpty() {
        return this.head == null;
    }
}
