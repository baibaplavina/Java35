package homeworks;

import java.util.Arrays;

public class HW13 {
    public static void main(String[] args) {

        int[] myNumbers = new int[]{25, 14, 56, 15, 36, 59, 7, 18, 29, 49};


        System.out.println("Original Array: " + Arrays.toString(myNumbers));

        System.out.println("Maximum value for the above array = " + (Arrays.stream(myNumbers).max()));

        System.out.println("Maximum value for the above array = " + (Arrays.stream(myNumbers).min()));

        System.out.println("Maximum through temp = " + max(myNumbers));

        System.out.println("Minimum through temp = " + min(myNumbers));
    }

      //Max value array
    public static int max(int[] a) {
           int largest = a[0];

        for (int i = 0; i < a.length; i++) {
            if (largest < a[i])
            largest = a[i];
        }
            return largest;
    }

    //Min value array

    public static int min(int[] a) {
        int smalest = a[0];

        for (int i = 0; i < a.length; i++) {
            if (smalest > a[i])
                smalest = a[i];
        }
        return smalest;
    }
}
