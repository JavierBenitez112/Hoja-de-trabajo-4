import Conversor.Factory;
import Conversor.InfixToPostfix;
import Operations.OperationManager;
import TxtReader.TxtLoader;
import Stack.DynamicStack;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Cargar datos del archivo de texto
        TxtLoader loader = new TxtLoader("InfixData.txt");
        String[] data = loader.loadFile();

        // Crear scanner para la entrada del usuario
        try (Scanner scanner = new Scanner(System.in)) {
            // Pedir al usuario que elija el tipo de Stack a usar
            System.out.println("Seleccione el tipo de Stack a utilizar:");
            System.out.println("1. ArrayList");
            System.out.println("2. Vector");
            System.out.println("3. Lista enlazada");

            // Leer el tipo de Stack seleccionado por el usuario
            int stackType = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de nextInt()

            // Crear el stack seleccionado por el usuario utilizando el Factory
            DynamicStack<Character> stackLetters = Factory.createStack(stackType);
            DynamicStack<Integer> stackExpressions = Factory.createStack(stackType);

            // Procesar cada expresión del archivo de texto
            for (String expression : data) {
                try {
                    // Convertir la expresión infix a postfix
                    String postfix = InfixToPostfix.convertToPostfix(expression);

                    // Imprimir la expresión postfix
                    System.out.println("Expresión Infix: " + expression);
                    System.out.println("Expresión Postfix: " + postfix);

                    // Evaluar la expresión postfix y mostrar el resultado
                    System.out.println("Resultado de la evaluación: " + evaluatePostfixExpression(stackExpressions, postfix));
                } catch (IllegalArgumentException e) {
                    System.err.println("Error al procesar la expresión: " + e.getMessage());
                }
            }
        } catch (Exception e) {
            System.err.println("Error al leer la entrada del usuario: " + e.getMessage());
        }
    }

    /**
     * Evaluar una expresión postfix utilizando la calculadora
     *
     * @param stack    Stack a utilizar para la evaluación
     * @param postfix  Expresión postfix a evaluar
     * @return         Resultado de la evaluación de la expresión postfix
     */
    private static int evaluatePostfixExpression(DynamicStack<Integer> stack, String postfix) {
        for (char ch : postfix.toCharArray()) {
            OperationManager.OperationPostFix(stack, ch);
        }
        return stack.pop();
    }
}
