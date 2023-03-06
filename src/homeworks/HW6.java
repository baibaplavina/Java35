package homeworks;

public class HW6 {
    public static void main(String[] args) {

        /*        Write an application, that will print the full latin alphabet
        (upper case letters) in alphabetical order. Each letter should be printed in new line.*/
        // Hit & Tricks - loop and CharExample need to use


        // Solution 1
        char a;
        for (a = 65; a <= 90; a++) {
            System.out.println(a);
        }

        System.out.println();
        // Solution 2
        for (a = 'A'; a <= 'Z'; a++) {
            System.out.println(a);
        }

        //Teacher's solution
        for(int i = 65; i<+90; i++) {
            System.out.println((char) i);
        }
    }
}
