package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();
    @Test
    public void testSumOfPositiveNumbers() {
        assertEquals(3, calculator.sum(1,2), "1+2 should equal 3");
    }
    @Test
    public void testSubtractWithPositiveNumbers() {
        assertEquals(3, calculator.subtract(5,2), "5 minus 2 should equal 3");
    }
    @Test
    public void testSubtractWithNegativeResults() {
        assertEquals(-1, calculator.subtract(1,2), "1 minus 2 should equal -1");
    }
    @Test
    public void testMultiplyWithPositiveNumbers() {
        assertEquals(12, calculator.multiply(3,4), "3 times 4 should equal 12");
    }
    @Test
    public void testMultiplyWithNegativeResults() {
        assertEquals(-6, calculator.multiply(-2,3), "-2 times 3 should equal -6");
    }
    @Test
    public void testDivideWithPositiveNumbers() {
        assertEquals(5, calculator.divide(10, 2), "10 divided by 2 should equal 5");
    }
    @Test
    public void testDivideDropsRemainder() {
        assertEquals(3, calculator.divide(7,2), "7 divided by 2 should equal 3" );
    }
    @Test
    public void testDivideByZeroThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> calculator.divide(5, 0),
                "Dividing by zero should throw IllegalArgumentException");
        assertEquals("Cannot divide by zero", exception.getMessage());    }
}

