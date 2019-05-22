package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class HW4_CheckMirrorArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the array: ");
        int lengthArray = sc.nextInt();
        int[] array = new int[lengthArray];
        boolean areMirror = true;

        for (int i = 0; i < lengthArray; i++) {
            System.out.println("Enter element " + (i+1) + " of the array");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < lengthArray/2 ; i++) {
            // array[array.lenght - 1 - i] - Checking the numbers from the last till the first.
            if (array[i] != array[array.length-1-i]){
                areMirror=false;
                System.out.println("Not mirror");
                break;
            }
            else {
                System.out.println("Mirror");
                break;
            }
        }
    }
}

