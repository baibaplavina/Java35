import org.w3c.dom.ls.LSOutput;

public class Operators {
    public static void main(String[] args) {
        //Basic arethmetic operators -, +. *, /, % (mojo)
        int x = 100;
        x = x + 10;
        System.out.println(x);

        x = x - 10;
        System.out.println(x);

        x = x * 10;
        System.out.println(x);

        x = x / 10;
        System.out.println(x);
//Atlikums no 10/7=1 un 3/7, atlikums 3, tā ir atbilde.
        x = x % 10;
        System.out.println(x);

        x = x % 76;
        System.out.println(x);

        //Assignment operator =, -=, +=, *=, /=

        int a = 10;
        a = 20;
        a += 20;
        System.out.println(a);

        int b = 10;
        b = 20;
        b -= 20;
        System.out.println(b);

        int c = 10;
        c = 20;
        c *= 20;
        System.out.println(c);

        int d = 10;
        d = 20;
        d /= 20;
        System.out.println(d);

        //Incrementation operators & decrementation operators ++, --
        int k = 10;
        k++;
        ++k;
        System.out.println(k);

        //Post-incrementation
        int num1 = 10;
        System.out.println(num1++);
        System.out.println(num1);

        char char4 = '\n';
        System.out.println(char4);

        //Pre-incrementation
        int num2 =10;
        System.out.println(++num2);
        System.out.println(num2);

        // 4ways of (increasing) increment by 1
        num1 = num1 + 1;
        num1 += 1;
        num1++;
        ++num1;


        //Relational oparators
        // Equality ==
        int p = 10;
        int t = 10;
        System.out.println("Equility " + (p==t));
        //Atdala ar iekavām, lai nejauc ar rēķināšanu

        //Inequality !=
        System.out.println("Inequality " + (p!=t));

        //Greater than > and greater than or equal to >=
        System.out.println("Answer: if p Greater than t? " + (p>t));
        System.out.println("Answer: if p Greater than or equal to t?  " + (p>=t));

        //Less than > and less than or equal to >=
        System.out.println("Answer: if p less than t? " + (p<t));
        System.out.println("Answer: if p less than or equal to t?  " + (p<=t));

        //LOGICAL OPERATORS
        // Logical AND - &&

        boolean sun = true;
        boolean dry = true;

        System.out.println("I will go outside " + (sun && dry));

        // Logical OR - ||

        boolean sale = true;
        boolean rich = true;

        System.out.println("I will buy iPhone " + (sale || rich));

// negation - parāda otradi - preteji
        boolean example = false;
        System.out.println(!example);

        int bobsAge = 8;
        int johnAge = 9;
        int annaAge = 10;
        // Is john older then bob and younger then anna?
        System.out.println("Is john older then bob and younger then anna? " + ((johnAge > bobsAge) && (johnAge < annaAge) ));
        //true - if both will be true.


    }
}
