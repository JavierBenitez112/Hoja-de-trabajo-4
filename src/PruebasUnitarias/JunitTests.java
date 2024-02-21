package PruebasUnitarias;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import Conversor.InfixToPostfix;

public class JunitTests {
    @Test
    public void testConvertToPostfix() {
        // Caso de prueba 1: Expresión infix simple
        String infix1 = "1+2*9";
        String expectedPostfix1 = "129*+";
        assertEquals(expectedPostfix1, InfixToPostfix.convertToPostfix(infix1));
}
}