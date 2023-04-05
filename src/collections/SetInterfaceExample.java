package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetInterfaceExample {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();
        //Add elements, random order, neatkārtojas dubultie Zoom meeting + - participants, sequence of the
        // participants not saved
        names.add("Bob");
        names.add("Anna");
        names.add("Liam");
        names.add("Anna");

        //Print out all elements

        System.out.println(names);

        // Remove elements - no indexes

        names.remove("Bob");
        System.out.println(names);

        //Size
        System.out.println(names.size());

        //Contains method, do not have in List, is there element in it or no, return true/false

        System.out.println(names.contains("Liam"));
        System.out.println(names.contains("Bob"));

        //How to iterate, if no index
        for (String str: names){
            System.out.println(str);
        }

        //Example 2
        HashSet<Integer> intSet1 = new HashSet<>();
        intSet1.add(1);
        intSet1.add(2);
        intSet1.add(3);
        intSet1.add(4);
        System.out.println("intSet1: " + intSet1);

        HashSet<Integer> intSet2 = new HashSet<>();
        intSet2.add(3);
        intSet2.add(4);
        intSet2.add(5);
        intSet2.add(6);

        System.out.println("intSet2 " + intSet2);

        //Find union, union both arrays and excluding duble numbers.
        HashSet<Integer> union = new HashSet<>(intSet1);
        System.out.println("union before: " + union);
        union.addAll(intSet2);
        System.out.println("union after: " + union);

        //Find intersection - kopējie elementi tiek izprintēti
        HashSet<Integer> intersection = new HashSet<>(intSet1);
        intersection.retainAll(intSet2);
        System.out.println("Intersection: " + intersection);

        //Find difference for intSet1 - unique elements in set1 will be printed out
        HashSet<Integer> difference1 = new HashSet<>(intSet1);
        difference1.removeAll(intSet2);
        System.out.println("Difference1 intSet1: " + difference1);

        //Find difference for intSet2 - unique elements in set1 will be printed out
        HashSet<Integer> difference2 = new HashSet<>(intSet2);
        difference2.removeAll(intSet1);
        System.out.println("Difference1 intSet1: " + difference2);

        //Find all differences 12 un 56
        HashSet<Integer> diffAll = new HashSet<>(difference1);
        diffAll.addAll(difference2);
        System.out.println("All differances "+ diffAll);

        //LinkedHashSet - holds the order

        LinkedHashSet<String>linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Estonia");
        linkedHashSet.add("Lituania");
        linkedHashSet.add("Latvia");
        linkedHashSet.add("Italy");

        linkedHashSet.remove("Latvia");
        System.out.println(linkedHashSet);

    }
}
