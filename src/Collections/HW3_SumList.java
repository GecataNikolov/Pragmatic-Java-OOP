package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HW3_SumList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int sumListLength = 10;
        int sumNumber;

        List<Integer> sumList = new ArrayList<>(sumListLength);

        System.out.print("Enter a number: ");
        int startNumber = sc.nextInt();

        for (int i = 0; i < sumListLength; i++) {
            if (i <= 1) {
                sumList.add(i, startNumber);
            } else {
                int firstPreviousNumber = sumList.get(i - 1);
                int  secondPreviousNumber = sumList.get(i - 2);

                sumNumber = firstPreviousNumber + secondPreviousNumber;
                sumList.add(i, (sumNumber));
            }
        }

        System.out.println(sumList.toString());


    }
}
