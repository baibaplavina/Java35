package basics;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your score 1-100");
        float score = scanner.nextFloat();

       if (score <= 40f) {
            System.out.println("Score is < = 40%");
        } else if (score > 40f && score <=80f) {
            System.out.println("Score is < = 80%");
        } else {
            System.out.println("Score is < = 100%");
           }

        if (score <= 40f) {
            System.out.println("Score is < = 40%");
        } else if (score <=80f) {
            System.out.println("Score is < = 80%");
            if (score <=60f){
                System.out.printf("<=60%");
            }else {
                System.out.printf(">60%");
            }
        } else {
            System.out.println("Score is < = 100%");
        }
    }
}
