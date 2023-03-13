package homeworks;

import javax.swing.border.MatteBorder;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW11 {
    public static void main(String[] args) {

        char again = 'y';
        while (again == 'y') {

            System.out.println("Please enter your personal code, example: xxxxxx-xxxxx");
            Scanner scanner = new Scanner(System.in);
            String enteredPC = scanner.nextLine();
            Pattern personalCode = Pattern.compile("[0-9]{6}[-]{1}[0-9]{5}");
            Matcher matcher = personalCode.matcher(enteredPC);
            System.out.println(matcher.matches());

            if (Pattern.matches(String.valueOf(personalCode), enteredPC)) {
                System.out.println("Your inputted personal number is valid. ");
            } else {
                System.out.println("Your inputted personal code is NOT valid. ");
            }

            System.out.println("Do you want to check your personal number again? y/n");
            again = scanner.next().charAt(0);

            //Fixing problem
            scanner.nextLine();
        }
    }
}
