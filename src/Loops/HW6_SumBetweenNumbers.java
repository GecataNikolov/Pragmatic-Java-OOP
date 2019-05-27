package Loops;

import java.util.Scanner;

public class HW6_SumBetweenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int upperLimit = sc.nextInt();
        int counter = 1;

        int sum;
        for (sum = 0; counter <= upperLimit; ++counter) {
            sum += counter;
        }

        System.out.println("The sum of the numbers between 1 and " + upperLimit + " is : " + sum);
    }
}
