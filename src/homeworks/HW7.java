package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
// Use the same functionality from previous task and create array. Sum all elements in
//the array.
// Ask for user to enter a positive number that will be the arrays size
// Create an empty array that will contain int data type values in size of entered value
// Using for loop ask user to enter array elements one by one
//  Print out all array elements
// Print out sum of all elements in the array

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a positive number that will be the arrays size:");

        int arraySize = scanner.nextInt();
        int[] arrayNumbers = new int[arraySize];
        System.out.println("Arrays size: " + arrayNumbers.length);

        //Loop which is arraySize and enter elements (arrayNo)in the numberArray
        int i;
       for (i=0; i< arrayNumbers.length; i++){
       System.out.println("Please enter elements No: " + (i+1));
       int enteredArrayNo = scanner.nextInt();
       arrayNumbers[i] = enteredArrayNo;
        }

       //Print out all array
        System.out.println("Source array: " + Arrays.toString(arrayNumbers));

       //Calculate sum of array elements
        int sum = 0;
       for(i=0; i< arrayNumbers.length; i++) {
           sum = sum + arrayNumbers[i];
       }
           System.out.println("Sum of all array elements is: " + sum);

    }
}
