package homeworks;

import javax.swing.border.MatteBorder;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char again = 'y';
        Pattern personalCode = Pattern.compile("[0-9]{6}[-]{1}[0-9]{5}");

        while (again == 'y') {
            // 1. Asking for input from user and calling matches method
            System.out.println("Please enter your personal code, example: xxxxxx-xxxxx");
            String enteredPC = scanner.nextLine();

            Matcher compare = personalCode.matcher(enteredPC);
            System.out.println(compare.matches());

            // 2. Determining is input is valid or not?
            if (Pattern.matches(String.valueOf(personalCode), enteredPC)) {
                System.out.println("Your inputted personal number is valid. ");
            } else {
                System.out.println("Your inputted personal code is NOT valid. ");
            }
            // 3. Asking if user wants to repeat the action
            System.out.println("Do you want to check your personal number again? y/n");
            again = scanner.next().charAt(0);

            //Fixing problem
            scanner.nextLine();
        }
    }
}
