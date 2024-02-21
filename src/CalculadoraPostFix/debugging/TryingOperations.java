package debugging;

import Stack.MyStack;

/**
 * Postfix
 */
public class TryingOperations {

    /**
     * Realiza las operaciones y muestra los resultados 
     *
     * @param args argumentos
     */
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<Integer>();

        String postfix = "12+4*3+";
        int result = 0;

        for (int i = 0; i < postfix.length(); i++) {
            switch (postfix.charAt(i)) {
                case '+':
                    result = stack.pop() + stack.pop();
                    System.err.println(result);
                    stack.push(result);
                    break;
                case '-':
                    result = stack.pop() - Character.getNumericValue(stack.pop());
                    System.out.println(result);
                    stack.push(result);
                    break;
                case '*':
                    result = stack.pop() * stack.pop();
                    System.out.println(result);
                    stack.push(result);
                    break;
                case '/':
                    result = stack.pop() / stack.pop();
                    System.out.println(result);
                    stack.push(result);
                    break;
                case ' ':
                    break;
                default:
                    stack.push(Character.getNumericValue(postfix.charAt(i))); // push
                    break;
            }
        }
    }
}
