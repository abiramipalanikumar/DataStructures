package dsa;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }

    public void setNext(Node<T> node) {
        this.next = node;
    }
}

public class SingleLinkedList<T> {

    Node<T> head;

    SingleLinkedList() {
        head = null;
    }

    public void push_back(T data) {
        if (this.isEmpty()) {
            head = new Node<T>(data);
        } else {
            Node<T> tempNode = head;
            while (tempNode != null && tempNode.next != null) {
                tempNode = tempNode.next;
            }
            Node<T> newNode = new Node<T>(data);
            tempNode.next = newNode;
        }
    }

    public void push_front(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.next = head;
        head = newNode;
    }

    public T pop_back() throws NullPointerException {
        if (this.isEmpty()) {
            throw new NullPointerException();
        }

        Node<T> temp = this.head, prev = null;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        if (prev != null) {
            prev.next = null;
        } else {
            this.head = null;
        }
        return temp.data;
    }

    public T pop_front() throws NullPointerException {
        if (this.isEmpty()) {
            throw new NullPointerException();
        } else {
            Node<T> temp = head;
            head = temp.next;
            return temp.data;
        }
    }

    public T get_head() throws NullPointerException {
        if (this.isEmpty()) {
            throw new NullPointerException();
        }
        return head.data;
    }

    public ArrayList<T> toArrayList() {
        ArrayList<T> list = new ArrayList<T>();
        Node<T> temp = this.head;
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }
        return list;
    }

    public int length() {
        Node<T> tempNode = this.head;
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