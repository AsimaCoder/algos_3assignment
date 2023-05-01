import java.util.ArrayList;
import java.util.EmptyStackException;
public class MyArrayListStack<E> {
    private ArrayList<E> list;

    public MyArrayListStack() {
        list = new ArrayList<>();
    }

    public void push(E element) {
        list.add(element);
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.remove(list.size() - 1);
    }

    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}

