package homeworks;

import java.util.Scanner;

public class HW12palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a name ");
        String enteredName = scanner.nextLine().toLowerCase().trim();
        int i = 0;
        int j = enteredName.length() - 1;

        while (i < j) {
            if (enteredName.charAt(i) != enteredName.charAt(j)) {
                System.out.println(enteredName + " is NOT a palindrome");
                System.exit(0);
            }
        i++;
        j--;
    }
        System.out.println(enteredName + " is a PALINDROME");

    }
}
