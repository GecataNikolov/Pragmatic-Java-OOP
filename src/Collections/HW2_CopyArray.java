package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HW2_CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lengthList = 0;

        while (true) {
            System.out.print("Enter number multiple times 2: ");
            lengthList = sc.nextInt();
            if (lengthList % 2 == 0) {
                break;
            } else {
                System.out.print("Not multiple times 2!");
            }
        }

        List<Integer> listInt = new ArrayList<>();

        for (int i = 0; i < lengthList / 2; i++) {
            System.out.print("Input integer in the list: ");
            listInt.add(sc.nextInt());
        }

        listInt.addAll(listInt);
        System.out.println(listInt.toString());

    }

}
