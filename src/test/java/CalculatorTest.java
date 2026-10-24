//Test Driven Development
// failing unit test first
// then minimum production code to pass

import org.junit.jupiter.api.Test; //FOR ANNOTATIONS

import static org.junit.jupiter.api.Assertions.*;


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

    @Test
    public void testMultiply() {
        assertEquals(2, calculator.multiply(1, 2));
        assertEquals(0, calculator.multiply(5, 0));
        assertEquals(-10, calculator.multiply(2, -5));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(2, 1));
        assertEquals(3, calculator.divide(9, 3));
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }

    // We have tested ints, let's test other data types: boolean (true or false)
    @Test
    public void testIsEven() {
        boolean actual = calculator.isEven(2);
        assertTrue(actual); // Expect true for even numbers
    }

    // We can do the same with assertFalse for odd numbers
    @Test
    public void testIsOdd() {
        boolean actual = calculator.isEven(3);
        assertFalse(actual); // Expect false for odd numbers
    }

}
