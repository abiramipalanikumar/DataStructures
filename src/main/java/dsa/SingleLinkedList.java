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

        if (this.isEmpty()) {
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

    public int pop_back() throws NullPointerException {
        if (this.isEmpty()) {
            throw new NullPointerException();
        }

        Node temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        int tempVal = temp.data;
        temp.next = null;
        return tempVal;

    }

    public int pop_front() throws NullPointerException {
        if (this.isEmpty()) {
            throw new NullPointerException();
        } else {
            Node temp = head;
            head = temp.next;
            return temp.data;
        }
    }

    public int get_head() throws NullPointerException {
        if (this.isEmpty()) {
            throw new NullPointerException();
        }
        return head.data;
    }

    public ArrayList<Integer> toArrayList() {

        ArrayList<Integer> list = new ArrayList<Integer>();
        if (!this.isEmpty()) {
            Node temp = head;
            while (temp != null) {
                list.add(temp.data);
                temp = temp.next;
            }
        }
        return list;
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