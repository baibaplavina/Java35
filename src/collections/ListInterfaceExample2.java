package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListInterfaceExample2 {
    public static void main(String[] args) {

        //Example1 whraper class intValue... int store Integer class

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println("List 1 = " + list1);

       //Put 1 array in another
        ArrayList<Integer> list2 = new ArrayList<>(list1);

        //Put 1 array in another 2nd method
        list2.addAll(list1);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);

        System.out.println("List2 = " + list2);

        //Example 2

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Test 1");
        arrayList.add("Test 2");
        arrayList.add("Test 3");

        //For loop
        for(int i=0; i< arrayList.size(); i++){
            System.out.print(arrayList.get(i) + ", ");
        }
        System.out.println();

        //For-each inerate through each element
        for(String str: arrayList){
            System.out.println(str);
        }

        //LinkedList

        LinkedList<String> car = new LinkedList<>();
        car.add("Augi");
        car.add("Opel");
        car.add("Toyota");
        System.out.println(car);

        //Last element printout
        System.out.println(car.get(car.size()-1));

        System.out.println(car.getLast());

        //Print first element
        System.out.println(car.get(0));
        System.out.println(car.getFirst());

        //Create a new LinkedList object (Integer)
        // Populate the list with values from 1 to 100
        // Print all elements in the consol

      LinkedList<Integer> list = new LinkedList<>();
      //Populating the list with values from 1 to 100
       for(int i = 1; i <=100; i++) {
            list.add(i);
        }
        System.out.println(list);

    }

}
