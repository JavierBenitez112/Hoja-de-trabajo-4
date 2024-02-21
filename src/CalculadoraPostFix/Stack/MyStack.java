package Stack;

import java.util.Vector;

/**
 * implementa la interfaz UVGStack
 *
 * @param <G> Tipo de elementos que se guarda
 */
public class MyStack<G> implements UVGStack<G> {

    private Vector<G> stack;

    /**
     * Constructor
     */
    public MyStack() {
        stack = new Vector<G>();
    }

    /**
     * Agrega un elemento a la cima
     *
     * @param item elemento que se agrega
     */
    public void push(G item) {
        stack.add(item);
    }

    /**
     * Elimina el elemento y lo pone en la cima
     *
     * @return elemento de la cima
     */
    public G pop() {
        G item = stack.lastElement();
        stack.remove(stack.size() - 1);
        return item;
    }

    /**
     * recibe elelemento de la cima
     *
     * @return elemento en la cima
     */
    public G Top() {
        return stack.lastElement();
    }

    /**
     * Verificar si esta vacía
     *
     * @return true si la está vacía, false si no.
     */
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
