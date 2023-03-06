package basics;

import java.util.Scanner;

public class StringExamples {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");

        //How to compare Strings
        //trim metod remove spaces in the begining and in the end, but not between text.

        String name = scanner.nextLine().toUpperCase().trim();

        // name == "Bob"// name.equals
        //2. var if (name.equals("Bob") || (name.equals("bob"))) {
        if (name.equals("BOB")){
            System.out.println("Your name is Bob");
        } else {
            System.out.println("Your name is not Bob");
        }*/

        // Combine sting values
        String text1 = "This is ";
        String text2 = "new text";

        System.out.println((text1 + text2));

        String result = text1.concat(text2);
        System.out.println(result);
        System.out.println("In this sentence there are " + result.length() + " characters");

        //indexOf = thIS IS new text - 2x IS
        // Sting is array of characters
        System.out.println(result.indexOf("is"));

        //charAt()
        System.out.println(result.charAt(0));
        System.out.println(result.charAt(1));
        System.out.println(result.charAt(2));
        System.out.println(result.charAt(3));

        //Replace - what we are looking for and how we replace it.
        String greetings = "This is holiday time. \nHave a nice holiday!";
        System.out.println(greetings.replaceAll("holiday","Christmas"));
        System.out.println("---");
        System.out.println(greetings.replaceAll("holiday","Easter"));
        System.out.println("---");
        System.out.println(greetings.replaceFirst("holiday", "Easter"));
        System.out.println("---");
        System.out.println(greetings.replaceAll("nice holiday", "nice Easter"));
        
    }
}
