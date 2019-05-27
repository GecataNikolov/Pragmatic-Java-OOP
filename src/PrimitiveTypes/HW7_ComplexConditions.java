package PrimitiveTypes;

import java.util.Scanner;

public class HW7_ComplexConditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer for hour");
        int hour = sc.nextInt();
        System.out.println("Money:");
        double money = sc.nextDouble();
        System.out.println("Are you sick(True/False)");
        boolean isSick = sc.nextBoolean();
        if (isSick) {
            System.out.println("I will stay at home");
            if (money > 0.0D) {
                System.out.println("Will buy drugs :D");
            } else {
                System.out.println("Nahh I don't have money. Let's make a tea party");
            }
        } else if (money <= 10.0D) {
            System.out.println("Party Hard b*tches lets drink Rakia");
        }
    }
}
