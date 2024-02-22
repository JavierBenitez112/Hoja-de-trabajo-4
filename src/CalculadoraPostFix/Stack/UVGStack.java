package com.Stack;

/**
 * Define el método básico
 *
 * @param <G> el tipo de elementos que se guardaran
 */
public interface UVGStack<G> {

    /**
     * Agrega un elemento
     *
     * @param item elemento que se agrega
     */
    void push(G item);

    /**
     * Elimina y devuelve el elemento en la cima
     *
     * @return elemento que estaba en la cima
     */
    G pop();

    /**
     * Obtiene el elemento en la cima
     *
     * @return el elemento en la cima
     */
    G top();

    /**
     * Verifica si está vacía.
     *
     * @return true si la pila está vacía, false si no.
     */
    boolean isEmpty();
}
