package Collections;

import java.util.*;

public class HW1_ListLowestMultiple3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the List: ");
        int listLength = sc.nextInt();
        List<Integer> listInt = new ArrayList<>(listLength);

        for (int i = 0; i <listLength ; i++) {
            System.out.print("Enter an integer for a " + i + " index: " );
            listInt.add(sc.nextInt());
        }

        Collections.sort(listInt);

        for (Integer currentInt : listInt) {
            if (currentInt % 3 == 0){
                System.out.println("Lowest number % 3 is " + currentInt);
                break;
            }
            else{
                System.out.println("No % 3 in the List");
            }
        }

    }
}
