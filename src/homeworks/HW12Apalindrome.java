package homeworks;

import java.util.Scanner;

public class HW12Apalindrome {
    public static void main(String[] args) {

        // I have questions why does not work code: 1) For Palidrome and Not Palindrome answer - this is not palindrome;
        // 2) Type answer enteredName/2 times / Where are mistakes and how to correct them?

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a name ");
        String enteredName = scanner.nextLine().toLowerCase().trim();

        int i = 0;
        int j = enteredName.length() - i;

        //Compare first and last letter/simbol, 2nd and 2nd from the end etc.
       for (i = 0; i < enteredName.length()/2; i++) {
         // System.out.println(i);
          if (i != j) {
           System.out.println("This is NOT palindrome");
          } else {
              System.out.println("This is PALINDROME");
          }
      }
    }
}
