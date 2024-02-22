package com.Operations;

import Stack.DynamicStack;

/**
 * Operaciones de evaluación
 */
public class OperationManager {

    /**
     * Postfix
     *
     * @param stack se realizan y almacenan las operaciones
     * @param item Representa la operación
     *
     * @throws ArithmeticException se divide por cero
     * @throws IllegalArgumentException el caracter no es valido
     */
    public static void OperationPostFix(DynamicStack<Integer> stack, Character item) {
        String allUseCharacters = "+-*/0123456789";

        int result = 0;

        if (allUseCharacters.contains(item.toString())) {
            switch (item) {
                case '+':
                    result = stack.pop() + stack.pop();
                    stack.push(result);
                    break;
                case '-':
                    int operand2 = stack.pop();
                    int operand1 = stack.pop();
                    result = operand1 - operand2;
                    stack.push(result);
                    break;
                case '*':
                    result = stack.pop() * stack.pop();
                    stack.push(result);
                    break;
                case '/':
                    int divisor = stack.pop();
                    if (divisor != 0) {
                        int dividend = stack.pop();
                        result = dividend / divisor;
                        stack.push(result);
                    } else {
                        throw new ArithmeticException("División por cero en la expresión.");
                    }
                    break;
                case ' ':
                    break;
                default:
                    // Convertir el carácter numérico en un valor entero
                    int operand = Character.getNumericValue(item);
                    stack.push(operand);
                    break;
            }
        } else {
            throw new IllegalArgumentException("El caracter '" + item + "' no es válido en la expresión.");
        }
    }
}
