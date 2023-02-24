package homeworks;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");

       int number = scanner.nextInt();

        System.out.println("Is number near 100? ");

           if (number >=90 && number <= 110) {
                System.out.println("True");
            } else{
            System.out.println("False");
           }

           // Skolotāja variants
        //int input = scanner.nextInt();
        // System.out.println(Math.abs(100 - input) <= 10);


        /*      Write an application, that will read one number from user (of type int)
        and check, if given number is "near" 100. A number is "near" 100 when
        difference between it and 100 is no bigger than 10.

        Your application should read one number (int) and print false or true on the screen,
        according to instructions above.*/
        // inbuild method

    }
}
