package basics;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {

        //Declaring array that will store 3 elements of type String

        String[] names = new String[3];

        //Access value No 1 from array
        System.out.println(names[0]);
        // atgriež null, ja kopne tukša

        // set element values using each element's index
        names[0] = "Ben";
        //Access value No 1 from array
        System.out.println(names[0]);
        names[1] = "Tom";
        names[2] = "Bob";

        //Access value No 1 from array
        System.out.println(names[1]);

        // Print out all arrays values
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        // Length of array - elements
        System.out.println(names.length);

        // Second way - declare and initialize array at the same time
        String[] dreamCars = new String[]{"BMW", "Tesla", "Ferrari", "Opel", "Ford"};

        // Length of array - elements
        System.out.println(dreamCars.length);

        //Iterate through all elements in array with for loop / Access all elements of the array

        for (int i = 0; i < dreamCars.length; i++) {
// otrais elements var būt i <=dreamCars.length -1
            System.out.println(dreamCars[i]);
        }

//Izprintēt kopu ar numerāciju.
        for (int i = 0; i < dreamCars.length; i++) {
            System.out.println((i + 1) + ". " + dreamCars[i]);
        }

        // Izprintē visu kopu - For-each loop type same idea - Lietot lai dabūtu datus no array ārā.
        for(String car : dreamCars){
            System.out.println(car);
        }
        // Veids kā izprintēt visu array. Izprintēt kvadrātiekavās, vienu no otra atdalot ar komatu.
        System.out.println(Arrays.toString(dreamCars));

        // we have an array of some amount int values
        // We need to give a comment for every element in the array
        // If the value is odd (nepāra skaitļi) or even (pāra skaitļi)

        // Vēl viens veids kā izveidot array
        int listOfNumbers [] = {234,5,45,23,65,33,1,64,2};

        //tO LOOP throught all elements let's use FOR-EACH loop
        for(int number : listOfNumbers){
            if(number % 2 ==0) {
                System.out.println(number + " even number");
            }else {
                System.out.println(number + " odd number");
            }
        }
    }
}