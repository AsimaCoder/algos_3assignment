import java.util.LinkedList;
import java.util.EmptyStackException;

public class MyLinkedListStack<E> {
    private LinkedList<E> list;

    public MyLinkedListStack() {
        list = new LinkedList<E>();
    }

    public void push(E element) {
        list.addFirst(element);
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.removeFirst();
    }

    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}
