package Stack;

import Pilas.ListaSimpleImplementacion;

public class ListaEnlazadaStack<T> implements DynamicStack<T> {
    private ListaSimpleImplementacion<T> stack;

    public ListaEnlazadaStack() {
        stack = new ListaSimpleImplementacion<>();
    }

    @Override
    public void push(T value) {
        stack.add(value);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("La pila está vacía");
        }
        return stack.remove();
    }

    @Override
public T top() {
    if (isEmpty()) {
        throw new RuntimeException("La pila está vacía");
    }
    
    // Devolver el elemento en la cabeza de la lista enlazada
    return stack.get();
}

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
