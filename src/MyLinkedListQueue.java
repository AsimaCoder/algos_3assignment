import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyLinkedListQueue<T> {

    private LinkedList<T> list;

    public MyLinkedListQueue() {
        list = new LinkedList<T>();
    }

    public void enqueue(T item) {
        list.addLast(item);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.removeFirst();
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
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


