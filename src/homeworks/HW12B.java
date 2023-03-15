package homeworks;

import java.util.Scanner;

public class HW12B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a name ");
        String enteredName = scanner.nextLine();

        // Make reverse of entered name
        String reverse = "";
        for(int i = enteredName.length() - 1; i>=0; i--) {
            reverse += enteredName.charAt(i);

            //Check reverse outprint one-by-one letter
            //System.out.println(reverse);
        }

        //Compare original entered name with reversed name
        boolean palindrome = true;
        for (int i = 0; i<enteredName.length(); i++) {
            if (enteredName.charAt(i) != reverse.charAt(i)) {
                palindrome = false;
            }
        }
              if(palindrome) {
                System.out.println(enteredName + " is a palindrome");
            } else {
                System.out.println(enteredName + " is NOT a palindrome");
        }
     }
}
