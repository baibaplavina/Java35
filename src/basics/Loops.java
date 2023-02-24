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
            //Izprintēt katru otro skaitli = 1,3,5; Sāk no skaitļa 1 darboties.
        for(int i = 1; i<= 10; i+=2) {
            System.out.print(i + " ");
        }

        System.out.println();

        //While   loop
      int i = 1;
        while (i <=10) {
            System.out.println("This is while loop " + i);
            i++;
        }
        // ja i = 100, tad neizprintē nevienu reizi, jo 100 nav mazāks par 10.

        System.out.println();

        // Do while
        // i vērtība jānomaina uz 1
        i = 1;
        do {
            System.out.println("This is DO while loop " + i);
            i++;
        } while (i<=10);

        // ja i = 100, tad izprintē 1x, jo do while 1x izdod un tad pārbauda.



    }
}
