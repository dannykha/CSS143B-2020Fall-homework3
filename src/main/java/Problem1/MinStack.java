package Problem1;

public class MinStack extends ArrayStack<Integer> {
    ArrayStack<Integer> stack;

    public MinStack(int size) {
        super(size);
        stack = new ArrayStack<>(size);
    }

    @Override
    public boolean push(Integer val) {
        if (stack.size() == 0 || stack.peek() >= val) {
            stack.push(val);
            return true;
        }
        super.push(val);
        return false;
    }

    @Override
    public Integer pop() {
        if (super.size() == 0) {
            return null;
        }
        int temp = super.pop();
        if (temp == stack.peek()) {
            stack.pop();
        }
        return temp;
    }

    public Integer getMin() {
        if (stack.size() == 0) {
            return null;
        }
        return stack.pop();
    }
}

