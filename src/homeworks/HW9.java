package homeworks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) {
        System.out.println("Enter tree levels");
        Scanner scanner = new Scanner(System.in);
        int treeLevels = scanner.nextInt();

        //Levels
        for (int i = 1; i <= treeLevels; i++) {
            //spaces
            for (int space = i; space <= treeLevels; space++) {
                System.out.print("  ");
            }
            //stars
            for (int star = 1; star <= i*2-1; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //Trunk
        for (int space = 0; space <= treeLevels-1; space++) {
                System.out.print("  ");
            }
           System.out.println("#");
    }
}