/**
 * Clase principal en la que se ejecuta el app
 */
import Operations.*;
import Stack.*;
import TxtReader.*;

public class App {
    /**
     *Inicia la ejecución del programa
     */
    public static void main(String[] args) {
        TxtLoader loader = new TxtLoader("datos.txt");
        String[] lines = loader.loadFile();

        MyStack<Integer> stack = new MyStack<Integer>();

        for (String line : lines) {
            for (Character item : line.toCharArray()) {
                OperationManager.OperationPostFix(stack, item);
            }

            System.out.println("Expresión: " + line + " = " + stack.pop());
        }
    }
}
