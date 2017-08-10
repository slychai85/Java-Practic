package Practic_JUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayProdTest {
    ArrayProd arrayProd;
    int[] arrayZ = {1, 3, 6, 3,};

    @Before
    public void initArrayProd() {
        arrayProd = new ArrayProd(arrayZ);
    }

    @After
    public void deleteArrayProd() {
        arrayProd = null;
    }

    @Test
    public void prodArray() throws Exception {
        int actual = arrayProd.prodArray(arrayZ);
        int expected = 54;
        assertEquals(expected, actual);
    }

    @Test
    public void prodArray1() throws Exception {
        int actual = arrayProd.prodArray(arrayZ);
        int  expected = 54;
        assertEquals(expected, actual);
    }

}