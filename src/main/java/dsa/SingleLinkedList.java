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

        if (head == null) {
            head = new Node(data);
        } else {
            Node tempNode = head;
            while (tempNode != null && tempNode.next != null) {
                tempNode = tempNode.next;
            }
            Node newNode = new Node(data);
            tempNode.next = newNode;
        }

    }

    public void push_front(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public int pop_back() {
        return 0;
    }

    public int pop_front() {
        return 0;
    }

    public int length() {
        Node tempNode = head;
        int length = 0;
        while (tempNode != null) {
            length++;
            tempNode = tempNode.next;
        }
        return length;
    }

    public boolean isEmpty() {
        return head == null;
    }
}