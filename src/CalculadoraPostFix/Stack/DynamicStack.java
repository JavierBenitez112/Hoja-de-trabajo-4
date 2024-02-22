package Stack;

public interface DynamicStack<T> {
    void push(T value);

    T pop();

    T top();

    boolean isEmpty();
}
