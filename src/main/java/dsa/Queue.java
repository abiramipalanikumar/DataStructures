package dsa;

public class Queue<T> {
    DoublyLinkedList<T> queue;

    Queue() {
        this.queue = new DoublyLinkedList<T>();
    }

    public void push(T data) {
        queue.push_front(data);
    }

    public T pop() throws NullPointerException {
        return queue.pop_back();
    }

    public int size()  {
        return queue.length();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public T peek() throws NullPointerException {
        return queue.get_head();
    }

}
