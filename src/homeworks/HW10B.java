package homeworks;

import java.util.Arrays;

public class HW10B {
    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 4, 5, 6, 20, 7, 8, 9, 10, 11, 12};
        System.out.println("Original array: " + Arrays.toString(myArray));

for(int i = 0; i<myArray.length / 2; i ++) {

    int tepm = myArray[i];
    myArray [i]  = myArray[myArray.length-1-i];
    myArray[myArray.length-1-i] = tepm;

}
        System.out.printf("Reverse array " + Arrays.toString(myArray));

    }
}