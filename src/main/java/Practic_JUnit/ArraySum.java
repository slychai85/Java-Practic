package Practic_JUnit;

import lombok.Data;

@Data
public class ArraySum {
    private double[] array;
    public ArraySum(double... array) {
        setArray(array);
    }

    static double sumArray(double... array) {
        double sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
