package homeworks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) {
        System.out.println("Enter tree levels");
        Scanner scanner = new Scanner(System.in);
        int treeLevels = scanner.nextInt();

        for (int i = 1; i <= treeLevels; i++) {
            for (int space = i; space <= treeLevels; space++) {
                System.out.print("  ");
            }
            for (int star = 1; star <= i*2-1; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int h = 1; h<=1; h++)   {
            for (int space = h; space <= treeLevels; space++) {
                System.out.print("  ");
            }
            for (int hash = 1; hash <= 1; hash++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}