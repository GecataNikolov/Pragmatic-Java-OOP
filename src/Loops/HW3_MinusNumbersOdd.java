package Loops;

public class HW3_MinusNumbersOdd {
    public static void main(String[] args) {
        for (int counter = -10; counter <= 10; ++counter) {
            if (counter % 2 == 1 || counter % 2 == -1) {
                System.out.println(counter);
            }
        }

    }
}
