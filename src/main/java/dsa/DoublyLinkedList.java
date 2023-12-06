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
        Node newNode = new Node(data);
        newNode.next = head;
        if (this.head != null)
            this.head.prev = newNode;
        this.head = newNode;
    }

    public void push_back(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
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
        ArrayList<Integer> list = new ArrayList<Integer>();
        Node temp = head;
        if (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }
        return list;
    }

    public int length() {
        Node temp = head;
        int length = 0;
        if (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    public boolean isEmpty() {
        return this.head == null;
    }
}
