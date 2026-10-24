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
    public void testSum()
    {
        int expected = -1;
        int actual = 2;
        assertEquals(expected, actual);
    }

}
