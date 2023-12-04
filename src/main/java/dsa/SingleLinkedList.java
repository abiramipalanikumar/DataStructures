package dsa;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    public void setNext(Node node) {
        this.next = node;
    }
}

public class SingleLinkedList {

    Node head;

    SingleLinkedList() {
        head = null;
    }

    public void push_back(int data) {

    }

    public void push_front(int data) {

    }

    public int pop_back() {
        return 0;
    }

    public int pop_front() {
        return 0;
    }

    public int length() {
        return 0;
    }

    public boolean isEmpty() {
        return head == null;
    }
}