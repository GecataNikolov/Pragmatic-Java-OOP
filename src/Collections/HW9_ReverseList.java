package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HW9_ReverseList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = sc.nextInt();

        List<Integer> listForReverse = new ArrayList<>(length);

        for (int i = 0; i < length; i++) {
            listForReverse.add(sc.nextInt());
        }

        System.out.println("Before reverse: " + listForReverse.toString());
        Collections.reverse(listForReverse);
        System.out.println("After reverse: " + listForReverse.toString());
    }
}
