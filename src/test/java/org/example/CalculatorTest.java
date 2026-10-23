package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();
    @Test
    public void testSumOfPositiveNumbers() {
        assertEquals(3, calculator.sum(1,2), "1+2 should equal 3");
    }
}

