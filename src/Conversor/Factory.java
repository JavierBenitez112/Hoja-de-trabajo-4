package Conversor;

import Stack.*;

/**
 * Clase Factory para crear instancias de la interfaz UVGStack con diferentes implementaciones
 */
public class Factory {

    /**
     * Método estático para crear una instancia de UVGStack con la implementación seleccionada
     *
     * @param choice Elección de la implementación de la pila:
     *               1 para ArrayList, 2 para Vector, 3 para Lista
     * @return Instancia de UVGStack con la implementación seleccionada
     */
    public static UVGStack<Integer> createStack(int choice) {
        switch (choice) {
            case 1:
                return new MyStack<Integer>(); // Implementación con Vector
            case 2:
                 // Implementación con ArrayList
            case 3:
                 // Implementación con Lista
            default:
                throw new IllegalArgumentException("Seleccion Invalida, Ingrese si desea usar la opcion 1,2 o 3.");
        }
    }

    /**
     * Método estático para convertir una expresión infix a postfix y almacenarla en la pila seleccionada
     *
     * @param infix Expresión infix a convertir
     * @param stack Pila donde se almacenará la expresión postfix
     */
    public static void convertAndPushToStack(String infix, UVGStack<Integer> stack) {
        String postfix = InfixToPostfix.convertToPostfix(infix);
        for (char ch : postfix.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(Character.getNumericValue(ch));
            }
        }
    }
}
