package Problem1;

import java.util.LinkedList;

public class LinkedListStack<T> implements Stack<T> {
    private LinkedList<T> data;
    // use the java linkedlist i guess lol
    public LinkedListStack() {
        data = new LinkedList<>();
    }

    @Override
    public boolean push(T val) {
        if (data == null) {
            return false;
        }
        data.addFirst(val);
        return true;
    }

    @Override
    public T pop() {
        if (data != null) {
            return data.removeFirst();
        }
        return null;
    }

    @Override
    public T peek() {
        if (data != null) {
            return data.getFirst();
        }
        return null;
    }

    @Override
    public int size() {
        if (data != null) {
            return data.size();
        }
        return 0;
    }
}
