//Test Driven Development
// failing unit test first
// then minimum production code to pass

import org.junit.jupiter.api.Test; //FOR ANNOTATIONS

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    //All unit tests in JUnit need to be
    // public void methods


    // This follows: Build, Operate, Check process
    @Test
    public void testSum() {
        // Positive, negative, and zero values
        assertEquals(3, calculator.sum(1, 2));
        assertEquals(-3, calculator.sum(-1, -2));
        assertEquals(5, calculator.sum(5, 0));
    }

    @Test
    public void testSubtract() {
        assertEquals(-1, calculator.subtract(1, 2));
        assertEquals(5, calculator.subtract(10, 5));
    }

}
