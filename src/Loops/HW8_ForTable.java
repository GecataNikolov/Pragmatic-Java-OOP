package Loops;

import java.util.Scanner;

public class HW8_ForTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = sc.nextInt();
        int printNumber = number - 1;

        for (int i = 0; i < number ; i++) {
            System.out.print(printNumber);
            for (int j = 1; j < number ; j++) {
                System.out.print(printNumber);

            }
            printNumber+=2;
            System.out.println();
        }
    }
}
