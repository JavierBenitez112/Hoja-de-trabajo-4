package com.Stack;

import java.util.Vector;

public class VectorStack<G> implements DynamicStack<G> {
    private Vector<G> stack;

    public VectorStack() {
        stack = new Vector<>();
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
    public G top() {
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
