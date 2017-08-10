package Practic_JUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySumTest {
    ArraySum arraySum;
    double[] array = {1, 3.4, 4, 4.6};

    @Before
    public void initArraySum () {
        arraySum = new ArraySum(array);
    }

    @After
    public void deleteArraySum () {
        arraySum = null;
    }

    @Test
    public void testSumArray() throws Exception {
        double actual = arraySum.sumArray(array);
        double expected = 13;
        assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void testSumArray1() throws Exception {
        double actual = arraySum.sumArray(array);
        double expected = 13;
        assertEquals(expected, actual, 0.000001);
    }

    @Test(expected = NullPointerException.class)
    public void sumArrayBy0() throws Exception {
        arraySum.sumArray(null);
    }


}