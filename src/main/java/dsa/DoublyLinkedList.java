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
        newNode.next = this.head;
        if (!this.isEmpty())
            this.head.prev = newNode;
        this.head = newNode;
    }

    public void push_back(int data) {
        Node newNode = new Node(data);
        if (this.isEmpty()) {
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
