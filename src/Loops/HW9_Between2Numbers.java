package Loops;

import java.util.Scanner;

public class HW9_Between2Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number A");
        int numberA = sc.nextInt();
        System.out.println("Enter a number B");
        int numberB = sc.nextInt();
        double sum = 0.0D;
        int i;
        int currentNumber;
        if (numberA > numberB) {
            for (i = numberB; i < numberA && sum < 200.0D; ++i) {
                if (i % 3 == 0) {
                    System.out.print("Skip " + i + ", ");
                } else {
                    currentNumber = i * i;
                    System.out.print(currentNumber + ", ");
                    sum += (double) currentNumber;
                }
            }
        } else if (numberB > numberA) {
            for (i = numberA; i < numberB && sum < 200.0D; ++i) {
                if (i % 3 == 0) {
                    System.out.print("Skip " + i + ", ");
                } else {
                    currentNumber = i * i;
                    System.out.print(currentNumber + ", ");
                    sum += (double) currentNumber;
                }
            }
        } else {
            System.out.println("There is no numbers between " + numberA + " and " + numberB);
        }

    }
}
