package Loops;

import java.util.Scanner;

public class HW10_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPrime = true;
        System.out.print("Check if your number is prime. Enter a number: ");
        int checkPrimeNubmer = sc.nextInt();

        for (int i = 2; i < checkPrimeNubmer / 2; ++i) {
            int checkerForPrime = checkPrimeNubmer % i;
            if (checkerForPrime == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("The number " + checkPrimeNubmer + " is Prime");
        } else {
            System.out.println("The number " + checkPrimeNubmer + " is NOT a prime");
        }

    }
}
