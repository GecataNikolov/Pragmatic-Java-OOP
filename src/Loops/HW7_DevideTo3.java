package Loops;

import java.util.Scanner;

public class HW7_DevideTo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int lastNum = sc.nextInt();
        int counter = 3;
        int printedChars = 1;

        while (true) {
            if (counter % 3 == 0) {
                System.out.print(counter);
                if (printedChars == lastNum) {
                    return;
                }

                System.out.print(",");
                ++printedChars;
            }

            ++counter;
        }
    }
}
