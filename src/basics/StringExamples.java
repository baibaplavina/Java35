package basics;

import java.util.Scanner;

public class StringExamples {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");

        //How to compare Strings
        //trim method remove spaces in the begining and in the end, but not between text.

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
        System.out.println(result.indexOf('x'));

        //charAt() - Izprintē pirmo vērtību/ otro, trešo, ceturto
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


        //Substring - Number from which index it print out the text/ cut of first 3 letters. /Ja iekavās ir 2 cipari,
        //tad no kura sāk un ar kuru beidz tekstu.
        String introduction = "Hello there! My name is Bob and I'm 66";
        System.out.println(introduction.substring(3));
        System.out.println(introduction.substring(6,11));

        //Sāk skaitīt no 0. 3 (trīs) ir 36 zīme.
        System.out.println(introduction.length());
        // Lieto .trim() metodi, lai noņemtu tukšo vietu pirms piemēram 6 years old.
        String bobsAge = introduction.substring(introduction.length()-2).trim();
        System.out.println("Bob is " + bobsAge + " years old");

        //Wraper class use to change String and use it with math operations/ Convert string to integer.

        int bobsAgeAsInteger = Integer.parseInt(bobsAge);
        if(bobsAgeAsInteger>=18){
            System.out.println("Adult");
        }else {
            System.out.println("Child");
        }

        //Wrapper class
        int temp1 = 36;
        Integer temp2 = 36;

        String intStrValue = "1";
        String floatStrValue = "2.0";
        String doubleStrValue = "2.5342323";
        String booleanStrValue = "true";
        String longStrValue = "1234134234243455";
        String charStrValue = "c";

        int intValue = Integer.parseInt(intStrValue);
        float floatValue = Float.parseFloat(floatStrValue);
        double doubleValue = Double.parseDouble(doubleStrValue);
        boolean booleanValue = Boolean.parseBoolean(booleanStrValue);
        long longValue = Long.parseLong(longStrValue);
        char charValue = charStrValue.charAt(0);



    }
}
