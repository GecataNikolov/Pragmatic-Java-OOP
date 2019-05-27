package PrimitiveTypes;

import java.util.Scanner;

public class HW1_NumberBetween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inputA = sc.nextDouble();
        double inputB = sc.nextDouble();
        double inputC = sc.nextDouble();
        if ((inputC <= inputA || inputC >= inputB) && (inputC >= inputA || inputC <= inputB)) {
            System.out.println("The number " + inputC + " is NOT between " + inputA + " and " + inputB);
        } else {
            System.out.println("The number" + inputC + " is between " + inputA + " and " + inputB);
        }

    }
}
