package Conversor;

import Stack.ArrayListStack;
import Stack.DynamicStack;
import Stack.ListaEnlazadaStack;
import Stack.VectorStack;

public class Factory {

    /**
     * Método estático para crear una instancia de DynamicStack con la implementación seleccionada
     *
     * @param choice Elección de la implementación de la pila:
     *               1 para ArrayList, 2 para Vector, 3 para Lista enlazada simple
     * @return Instancia de DynamicStack con la implementación seleccionada
     */
    public static <T> DynamicStack<T> createStack(int choice) {
        switch (choice) {
            case 1:
                return new ArrayListStack<>();
            case 2:
                return new VectorStack<>();
            case 3:
                return new ListaEnlazadaStack<>();
            default:
                throw new IllegalArgumentException("Invalid choice. Please choose 1, 2, or 3.");
        }
    }
}
