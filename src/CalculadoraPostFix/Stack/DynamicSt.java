package com.Stack;

public interface DynamicSt<T> {
    void push(T value);

    T pop();

    T top();

    boolean isEmpty();
}
