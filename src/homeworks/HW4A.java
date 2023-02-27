package homeworks;

import java.util.Scanner;

public class HW4A {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                // Lina risinajums


                    System.out.println("Please enter 2 numbers.");
                    int num1 = scanner.nextInt();
                    int num2 = scanner.nextInt();
                    System.out.println((((num1>0) && (num2>0)) || ((num1<0) && (num2<0))) && ((num1!=0) && (num2!=0)));

                }
            }


        /*     Write an application, that will read two numbers from user
        (of type int) and will print true, if both numbers are the
        same sign (both are positive, or both are negative), or false
        otherwise.

        If at least one of given numbers is equal to 0, your application
        should print false.*/

