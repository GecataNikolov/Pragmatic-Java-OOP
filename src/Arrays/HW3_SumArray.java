package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class HW3_SumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an array's start number");
        int startNumber = sc.nextInt();
        int[] array = new int[10];
        int sum= 0;
        for (int i = 0; i < array.length; i++) {
            if(i<=1){
                array[i]= startNumber;
                sum+=startNumber;
            }
            else {
                array[i] =sum;
                sum+= array[i-1];
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
