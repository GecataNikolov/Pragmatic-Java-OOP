package Arrays;

import java.util.Arrays;

public class HW5_IndexMultiplied {
    public static void main(String[] args) {
        double[] doubleArray = new double[10];

        for (int i = 0; i < doubleArray.length ; i++) {
            doubleArray[i]= i*3;
        }
        System.out.println(Arrays.toString(doubleArray));
    }
}
