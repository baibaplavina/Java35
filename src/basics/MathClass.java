package basics;

import org.w3c.dom.ls.LSOutput;

public class MathClass {
    public static void main(String[] args) {

        float num = 5.6f;
        System.out.println(num);

        // Rounding down
        System.out.println("Floor: " + Math.floor(num));

        // Rounding up
        System.out.println ("Ceil: " + Math.ceil(num));

        //Rounding according to Math rule
        System.out.println("Round:   "  + Math.round(num));

        // ABS Absolute value How fare are from 0/ modulis/
        System.out.println("ABS : " + Math.abs(num));

        //Power - pakāpe two in a power of 2 Divi otrajā pakāpē. Jābūt 2 argumentiem, kādu ciparu un kādā pakāpē.
        System.out.println("Power  "+ Math.pow(2,3) );

        //Max - determining between 2 numbers, which ir bigger. Both inputs are same type.
        System.out.println("Max  "+ Math.max(56,89));

        System.out.println("Max  "+ Math.max(num,1.2));
        // Jābūt f beigās, savādāk nesalīdzina 2 skaitļu veidus.

        System.out.println("Max  "+ Math.max(num,1.2f));

        // Max out of 3 values
        //10, 14,19
        System.out.println("Max out of 3 is " + Math.max(Math.max(14,19), 10) );

        //SQRT - kvadrātsakne
        System.out.println("SQRT: " + Math.sqrt(4));

        //Random - generating random value - generating something between 0 and 1.
        System.out.println("Random: " + Math.random());
        System.out.println("Random from (0-9): " +  (int) (Math.random() *10));
        System.out.println( "Random (0-10)  " + (int) (Math.random() *11));
        System.out.println("Random from (0-10): " +  ((int) (Math.random() *10) + 1));







    }
}
