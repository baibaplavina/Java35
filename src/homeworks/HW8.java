package homeworks;

import java.util.Arrays;
import java.util.Scanner;
public class HW8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a positive number that will be the arrays size:");
        int arraySize = scanner.nextInt();

        float [] arrayNumbers = new float [arraySize];

        //Loop which is arraySize and enter elements (arrayNo)in the numberArray
        int i;
        float sum = 0;
        int count=0;

        for (i = 0; i < arrayNumbers.length; i++) {
            System.out.println("Please enter element No: " + (i + 1));
            int enteredArrayNo = scanner.nextInt();
            arrayNumbers[i] = enteredArrayNo;
              sum = sum + arrayNumbers[i];
              count++;
            }

        //Print out all array
        System.out.println("Source array: " + Arrays.toString(arrayNumbers));
        System.out.println("Sum of all array elements is: " + sum);
        System.out.println("Avarage grade: " + sum/arraySize);
        System.out.println("There was passed " + count + " values");

    }
}