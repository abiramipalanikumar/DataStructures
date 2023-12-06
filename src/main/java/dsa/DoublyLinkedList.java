package dsa;

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

public class DoublyLinkedList {

    Node head;

    public DoublyLinkedList() {
        this.head = null;
    }

    public void push_front(int data) {
    }

    public void push_back(int data) {
    }

    public int pop_front() {
        return 0;
    }

    public int pop_back() {
        return 0;
    }

    public int get_head() {
        return 0;
    }

    public int get_tail() {
        return 0;
    }

    public ArrayList<Integer> toArrayList() {
        return new ArrayList<>();
    }

    public int length() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }
}
