package homeworks;

import java.util.Scanner;

public class HW9B {
    public static void main(String[] args) {
        System.out.println("Enter tree levels");
        Scanner scanner = new Scanner(System.in);
        int treeLevels = scanner.nextInt();
    // Code for tree
        for (int i = 1; i<=treeLevels; i++) {
            //print for spaces
            for (int space = 1; space <= treeLevels - i; space++) {
                System.out.print("  ");
            }
                // print for stars
            for (int star = 1; star <= i * 2 - 1; star++) {
                System.out.print("* ");
            }
                    System.out.println();
    }
    // Code for tree leg
        for (int h = 1; h<=1; h++)   {
        for (int space = 1; space <= treeLevels - 1; space++) {
            System.out.print("  ");
        }
        for (int hash = 1; hash <= 1; hash++) {
            System.out.print("#");
    }
            System.out.println();
        }
    }
}