package tasks;

import java.util.Scanner;

public class LeapYearInMethod {

           public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);
               System.out.println("Please enter the year");
               int year = scanner.nextInt();

               determinLeapYear(year);
            System.out.println(determineLeapYearString(year));
           }


    public static void determinLeapYear(int year) {
        if (year < 0) {
            System.out.println("Invalid Input");
        } else if (year > 2100) {
            System.out.println("You are looking too far in the future, live for today");
        } else {
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 == 0))) {
                System.out.println("Leap year");
            } else {
                System.out.println("Not leap");
            }
        }
    }

            public static String determineLeapYearString(int year){
               String answer;
                    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 == 0))) {
                      //1st option
                       // return "Leap year";
                        //2nd option
                        answer = "Leap year";
                        } else {
                       //1st option
                      //  return "Not leap";
                        //2nd option
                        answer = "Not a leap year";
                    }
                    //2nd option
                    return answer;
        }
}
