import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MyArrayListQueue<T> {

    private ArrayList<T> list;

    public MyArrayListQueue() {
        list = new ArrayList<T>();
    }

    public void enqueue(T item) {
        list.add(item);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.remove(0);
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.get(0);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}

