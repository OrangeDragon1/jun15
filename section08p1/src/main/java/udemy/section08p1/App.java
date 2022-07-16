package udemy.section08p1;

import java.util.ArrayList;
import java.util.LinkedList;

public class App 
{
    public static void main( String[] args )
    {
        // Customer customer = new Customer("Tim", 54.96);
        // Customer anotherCustomer;
        // anotherCustomer = customer;
        // anotherCustomer.setBalance(12.18);
        // // anotherCustomer is just referencing customer, a new object was not created

        // ArrayList<Integer> intList = new ArrayList<>();

        // intList.add(1);
        // intList.add(3);
        // intList.add(4);

        // printList(intList);

        // intList.add(1, 2); // element 2 is inserted in position 1, element 3 moves down to position 2
        // printList(intList);

        // intList.remove(2);
        // printList(intList);
        // String name1 = "elephant";
        // String name2 = "monkeys";
        // String name3 = "mammoth";

        // System.out.println(name1.compareTo(name2)); //output of -8 means name1 should be placed before name2
        // System.out.println(name2.compareTo(name1)); //output of 8 means name2 should be placed after name1
        // System.out.println(name3.compareTo(name2));

    }

    public static void printList(ArrayList<Integer> intList) {
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
        }
    }
}
