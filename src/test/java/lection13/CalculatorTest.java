package lection13;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void initCalculator() {
        calculator = new Calculator();
    }

    @After
    public void deleteCalculator() {
        calculator = null;
    }
    @Test
    public void dev() throws Exception {
//        fail();
        int actual = calculator.dev(4, 2);
        int expected = 2;
        assertEquals("Test for dev", expected, actual);
    }
    @Test (expected = ArithmeticException.class)
    public void devBy0() throws Exception {
        calculator.dev(4, 0);
    }
    @Test
    public void sum() throws Exception {
        int actual = calculator.sum(3, 2);
        int expected = 5;
        assertEquals("Test for sum", expected, actual);
    }

}