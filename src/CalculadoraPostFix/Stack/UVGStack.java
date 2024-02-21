package Stack;

/**
 * define el método básico
 *
 * @param <G> el tipo de elementos que se guardaran
 */
public interface UVGStack<G> {

    /**
     * Agrega un elemento
     *
     * @param item elemento que se agrega
     */
    public void push(G item);

    /**
     * Elimina y devuelve el elemento en la cima
     *
     * @return elemento que estaba en la cima
     */
    public G pop();

    /**
     * Obtiene el elemento en la cima
     *
     * @return El elemento en la cima
     */
    public G Top();

    /**
     * Verifica si está vacía.
     *
     * @return true si la pila está vacía, false si no.
     */
    public boolean isEmpty();
}
