package com.PruebasUnitarias;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Stack.DynamicSt;
import Conversor.Factory;
import Conversor.InfixToPostfix;

public class JunitTests {
    @Test
    public void testConvertToPostfix() {
        // Caso de prueba 1: Expresión infix simple
        String infix1 = "1+2*9";
        String expectedPostfix1 = "129*+";
        assertEquals(expectedPostfix1, InfixToPostfix.convertToPostfix(infix1));}
    
        @Test
        public void testArrayListStack() {
            DynamicSt<Integer> stack = Factory.createStack(1); // Crear ArrayListStack
            assertTrue(stack.isEmpty()); // Verificar que la pila está vacía al principio
    
            stack.push(1);
            stack.push(2);
            stack.push(3);
    
            assertEquals(3, stack.pop().intValue()); // Verificar pop
            assertEquals(2, stack.top().intValue()); // Verificar top
            assertFalse(stack.isEmpty()); // Verificar que la pila no está vacía después de empujar elementos
        }
    
        @Test
        public void testVectorStack() {
            DynamicSt<Integer> stack = Factory.createStack(2); // Crear VectorStack
            assertTrue(stack.isEmpty()); // Verificar que la pila está vacía al principio
    
            stack.push(1);
            stack.push(2);
            stack.push(3);
    
            assertEquals(3, stack.pop().intValue()); // Verificar pop
            assertEquals(2, stack.top().intValue()); // Verificar top
            assertFalse(stack.isEmpty()); // Verificar que la pila no está vacía después de empujar elementos
        }
    
        @Test
        public void testLinkedListStack() {
            DynamicSt<Integer> stack = Factory.createStack(3); // Crear ListaEnlazadaStack
            assertTrue(stack.isEmpty()); // Verificar que la pila está vacía al principio
    
            stack.push(1);
            stack.push(2);
            stack.push(3);
    
            assertEquals(1, stack.pop().intValue()); // Verificar pop
            assertEquals(2, stack.top().intValue()); // Verificar top
            assertFalse(stack.isEmpty()); // Verificar que la pila no está vacía después de empujar elementos
        }
}