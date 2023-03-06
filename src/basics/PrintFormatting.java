package basics;

public class PrintFormatting {
    public static void main(String[] args) {

        // s - Sting
        // d - integer
        // f - float/double
        // c - char
        // b- boolean

        String name = "Bob";
        int age = 34;

        System.out.println("Hello " + name+ " your age is " + age);
        //souf - shortcut
        System.out.printf("Hello %s your age is %d\n", name, age);

        //go to next line - \n

        // rounding numbers
        double height = 192.2352534d;
        System.out.printf("%s is %.2f cm tall\n", name, height);

        // Use in text veriables 2 and > time. Give numbers to veriables, all of them
        //Hello Bob your age is 34 and your height is 192 .... Good job Bob!
        System.out.printf("Hello %1$s your age is %2$d and your height is %3$.2f. Good job %1$s!", name, age, height);



    }
}
