package Practic_JUnit;

import lombok.Data;

@Data
public class ArrayProd {
    private int[] arrayZ;

    public ArrayProd(int[] arrayZ) {
        setArrayZ(arrayZ);
    }

    static int prodArray (int[] arrayZ) {
        int prod = arrayZ[0];
        for (int i = 1; i < arrayZ.length; i++) {
            prod *= arrayZ[i];
        }
        return prod;
    }

}
