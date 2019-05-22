package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class HW2_CoppyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();

        int [] mirrorArray = new int[n];

        for (int i = 0; i < n/2; i++) {
            System.out.println("Enter element " + i);
            mirrorArray[i] = sc.nextInt();
        }
        System.arraycopy(mirrorArray,0, mirrorArray,mirrorArray.length/2,mirrorArray.length/2);

        System.out.println(Arrays.toString(mirrorArray));

    }
}
