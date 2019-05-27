package PrimitiveTypes;

import java.util.Scanner;

public class HW2_ProgressiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double firstNum = sc.nextDouble();
        double secondNum = sc.nextDouble();
        double thirdNum = sc.nextDouble();
        if (firstNum > secondNum && firstNum > thirdNum) {
            if (secondNum > thirdNum) {
                System.out.println(firstNum);
                System.out.println(secondNum);
                System.out.println(thirdNum);
            } else {
                System.out.println(firstNum);
                System.out.println(thirdNum);
                System.out.println(secondNum);
            }
        }

        if (secondNum > firstNum && secondNum > thirdNum) {
            if (firstNum > thirdNum) {
                System.out.println(secondNum);
                System.out.println(firstNum);
                System.out.println(thirdNum);
            } else {
                System.out.println(secondNum);
                System.out.println(thirdNum);
                System.out.println(firstNum);
            }
        }

        if (thirdNum > firstNum && thirdNum > secondNum) {
            if (firstNum > secondNum) {
                System.out.println(thirdNum);
                System.out.println(firstNum);
                System.out.println(secondNum);
            } else {
                System.out.println(thirdNum);
                System.out.println(secondNum);
                System.out.println(firstNum);
            }
        }
    }
}
