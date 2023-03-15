package oop;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println( " Please enter your name");
        String usersName = scanner.nextLine();
       // System.out.println(usersName);

        System.out.println("Please enter your age");
        int usersAge = scanner.nextInt();

        printName(usersName, usersAge);

        String answer2 = greetings(usersName);
        System.out.println(answer2);

     //   printName("Bob");
     //   printName("Lisa");
    }
        // name = userName
        //age = userAge
    public static void printName(String name, int age) {
        System.out.println("Hello your name is " + name) ;
        System.out.println("You are " + age + "years old");
    }

public static String greetings(String name){
        String result = "Hi " + name;
        return result;
    }
}
