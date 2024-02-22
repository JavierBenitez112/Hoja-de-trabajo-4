package com.Stack;
import java.util.ArrayList;
    

public class ArrayListStack<T> implements DynamicStack<T> {

    private ArrayList<T> stack; // Lista interna para almacenar los elementos de la pila

    /**
     * Constructor para inicializar la pila como un ArrayList vacío.
     */
    public ArrayListStack() {
        this.stack = new ArrayList<T>();
    }

    /**
     * Agrega un elemento a la cima de la pila.
     *
     * @param value el elemento a agregar
     */
    @Override
    public void push(T value) {
        stack.add(value); // Agrega el elemento al final de la lista
    }

    /**
     * Elimina y devuelve el elemento en la cima de la pila.
     *
     * @return el elemento en la cima de la pila
     * @throws RuntimeException si la pila está vacía
     */
    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("El PostFixStack está vacío");
        }
        return stack.remove(stack.size() - 1); // Elimina y devuelve el elemento en la última posición de la lista
    }

    /**
     * Devuelve el elemento en la cima de la pila sin eliminarlo.
     *
     * @return el elemento en la cima de la pila
     * @throws RuntimeException si la pila está vacía
     */
    @Override
    public T top() {
        if (isEmpty()) {
            throw new RuntimeException("El PostFixStack está vacío");
        }
        return stack.get(stack.size() - 1); // Devuelve el elemento en la última posición de la lista
    }

    /**
     * Devuelve el tamaño actual de la pila.
     *
     * @return el tamaño de la pila
     */
    public int size() {
        return stack.size();
    }

    /**
     * Verifica si la pila está vacía.
     *
     * @return true si la pila está vacía, false de lo contrario
     */
    @Override
    public boolean isEmpty() {
        return stack.isEmpty(); // Verifica si la lista está vacía
    }
}
