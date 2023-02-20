package basics;

public class Loops {
    public static void main(String[] args) {
        System.out.println("Hello World!");
//Dry principle = don't repeat yourself

        System.out.println(1);
        System.out.println(1+1);

        for(int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
            // lokālais i, nav sasniedzams globāli.
        }

        for(int i = 0; i<= 10; i++) {
            System.out.println(i);
        }
            // Ja i=1, tad sāks numerāciju no 1 for(int i = 1; i<= 10; i++) {

            for(int i = 0; i<= 10; i++) {
            System.out.print(i + " ");
            //    bez ln, visi būs blakus
        }
            //Tukša rindiņa
        System.out.println();
            //Izprintēt katru otro skaitli = 1,3,5
        for(int i = 1; i<= 10; i+=2) {
            System.out.print(i + " ");
        }

    }
}
