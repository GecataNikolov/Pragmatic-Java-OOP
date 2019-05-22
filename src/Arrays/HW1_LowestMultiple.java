package Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class HW1_LowestMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];
        //Array sort
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter number:");
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println("Lowest number % 3 is "+ array[i]);
                break;
            }

        }

    }
}
