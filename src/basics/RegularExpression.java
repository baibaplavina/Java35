package basics;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        //Example1
        Pattern pattern = Pattern.compile("a+b");
        Matcher matcher = pattern.matcher("aaaaab");

        System.out.println(matcher.matches());

        Matcher matcher1 = pattern.matcher("b");
        System.out.println(matcher1.matches());


        //vai satur/ ietur daļu no šī
        System.out.println(matcher.find());

        System.out.println();
        //Example 2
        //Any 3 symbols, that would be any lower case letter or number from 5 to 9
        System.out.println(Pattern.matches("[a-z5-9]{3}", "abc"));

        //2 Uppercase letters followed by at least 2 lower case letters and then by 3 numbers/ ORDER is important

        System.out.println(Pattern.matches("[A-Z]{2}[a-z]{2,}[0-9]{3}","UFjdasasasa923"));
        System.out.println(Pattern.matches("[A-Z]{2}[a-z]{2,}[0-9]{3}","aUFjdasasasa923"));

        //7 any letters of any numbers
        //System.out.println(Pattern.matches("","jD46df"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your car's plate number");
        String plateNumber = scanner.nextLine();

        //2 Uppercase letters followed by one "-" symbol and then 2 to 4 numbers

        if (Pattern.matches("[A-Z]{2}-[0-9]{2,4}", plateNumber)) {
            System.out.println("Your plate number in valid");
        }else{
            System.out.println("Your plate number is not valid");
        }
    }
}
