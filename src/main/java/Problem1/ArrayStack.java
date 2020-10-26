package Problem1;

import java.util.EmptyStackException;

public class ArrayStack<T> implements Stack<T> {
    private T[] data;
    private int size;



    public ArrayStack() { // imposter
    }

    public ArrayStack(int capacity) { // yes initialize
        if (capacity > 0) {
            data = (T[]) new Object[capacity];
            size = 0;
        }
        size = 0;
    }

    @Override
    public boolean push(T val) { // should be good too
        if (data == null || data.length == 0 || size == data.length) {
            return false;
        }
        size++;
        data[size - 1] = val;
        return true;
    }

    @Override
    public T pop() { // should be good i hope
        if (size == 0) {
            return null;
        }
        T val = data[size - 1];
        data[size - 1] = null;
        size--;
        return val;
    }

    @Override
    public T peek() {  // should also be good
        if (size == 0) {
            return null;
        }
       return data[size - 1];
    }

    @Override
    public int size() { // good
        return size;
    }
}
