package dsa;

public class Stack<T> {
    DoublyLinkedList<T> stack;

    Stack() {
        this.stack = new DoublyLinkedList<T>();
    }

    public void push(T data) {
        stack.push_front(data);
    }

    public T pop() throws NullPointerException {
        return stack.pop_front();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.length();
    }

    public T top() throws NullPointerException {
        return stack.get_head();
    }

}
