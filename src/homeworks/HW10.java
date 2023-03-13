package homeworks;
import java.util.Arrays;

public class HW10 {
    public static void main(String[] args) {

        int [] myArray = {1,2,3,4,5,6,20,7,8,9,10,11,12};
        System.out.println("Original array: " + Arrays.toString(myArray));

        //Buble method
       int n = myArray.length;
        int temporary = 0;
        for(int i=0; i < n; i++) {
            for (int j=1; j<(n-i); j++){
                if(myArray[j-1] > myArray[j]) {
                        temporary = myArray[j-1];
                        myArray[j-1] = myArray[j];
                        myArray[j] = temporary;
                }
            }
        }
            System.out.println("New array: " + Arrays.toString(myArray));
        }
    }