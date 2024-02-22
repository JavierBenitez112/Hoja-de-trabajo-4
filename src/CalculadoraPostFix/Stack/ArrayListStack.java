package Stack;

import java.util.ArrayList;

public class ArrayListStack<G> implements UVGStack<G> {
    private ArrayList<G> stack;

    public ArrayListStack() {
        stack = new ArrayList<>();
    }

    @Override
    public void push(G item) {
        stack.add(item);
    }

    @Override
    public G pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.remove(stack.size() - 1);
    }

    @Override
    public G Top() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.get(stack.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
