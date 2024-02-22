package com.Conversor;

import java.util.Stack;

/**
 * Clase para convertir expresiones infix a postfix
 */
public class InfixToPostfix {

    /**
     * Método para convertir una expresión infix a postfix
     *
     * @param infix Expresión infix a convertir
     * @return Expresión postfix convertida
     */
    public static String convertToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        stack.push('#'); // Carácter especial para inicializar la pila
        
        for (char ch : infix.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == '^') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop(); // Sacar '(' de la pila
            } else {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        
        while (!stack.isEmpty() && stack.peek() != '#') {
            postfix.append(stack.pop());
        }
        
        return postfix.toString();
    }
    
    private static int precedence(char op) {
        switch (op) {
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return -1;
        }
    }
}
