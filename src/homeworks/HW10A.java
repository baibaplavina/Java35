package homeworks;
import java.util.Arrays;

public class HW10A {
    public static void main(String[] args) {

        int [] myArray = {1,2,3,4,5,6,20,7,8,9,10,11,12};
        System.out.println("Original array: " + Arrays.toString(myArray));

        Arrays.sort(myArray);

        System.out.println("New array: " + Arrays.toString(myArray));
    }
}