package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HW6_SizeAndEqualsLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of first List: ");
        int firstListLenth = sc.nextInt();
        List<Integer> firstIntList = new ArrayList<>(firstListLenth);
        for (int i = 0; i < firstListLenth; i++) {
            firstIntList.add(sc.nextInt());
        }

        System.out.print("Enter length of second List: ");
        int secondListLenth = sc.nextInt();
        List<Integer> secondIntList = new ArrayList<>(secondListLenth);
        for (int i = 0; i < secondListLenth; i++) {
            secondIntList.add(sc.nextInt());
        }

        if (firstIntList.size() == secondIntList.size()){
            System.out.println("The list has same length");
            if (firstIntList.equals(secondIntList)){
                System.out.println("The list are same");
            }
            else{
                System.out.println("Lists are different");
            }
        }
        else{
            System.out.println("The lists are different and with different size");
        }
    }

}
