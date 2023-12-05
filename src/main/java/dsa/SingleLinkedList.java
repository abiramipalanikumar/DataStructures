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
        if (head != null) {
            Node temp = head, prev = null;
            while (temp.next != null) {
                prev = temp;
                temp = temp.next;
            }
            if (prev != null) {
                prev.next = null;
                return temp.data;
            }
        }
        return 0;
    }

    public int pop_front() {
        if (head != null) {
            Node temp = head;
            head = temp.next;
            return temp.data;
        }
        return 0;
    }

    public int get_head() {
        if (head != null) {
            return head.data;
        }
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