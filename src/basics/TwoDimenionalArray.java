package basics;

import java.util.Arrays;

public class TwoDimenionalArray {
    public static void main(String[] args) {

        //Declaring 2D array with 2 rows and 5 columns
        //  String[] [] dreamCars2 = new String[][] {{Audi, BMW, ...}, {Lada, Ferrari, ...}};

        String[][] dreamCars = new String[2][5];
        dreamCars[0][0] = "Audi";
        dreamCars[0][1] = "BMW";
        dreamCars[0][2] = "Opel";
        dreamCars[0][3] = "Volvo";
        dreamCars[0][4] = "Lamorghini";

        dreamCars[1][0] = "Lada";
        dreamCars[1][1] = "Ferrari";
        dreamCars[1][2] = "Subaru";
        dreamCars[1][3] = "Saab";
        dreamCars[1][4] = "McLaren";

        //How many rows are in array
        System.out.println(dreamCars.length);

        //How many columns are in one row
        System.out.println(dreamCars[0].length);

        // Print out elements

        //i - row
        //j - column
        // nested for loop
        for (int i = 0; i < dreamCars.length; i++) {
            for (int j = 0; j < dreamCars[i].length; j++) {
                // j < dreamCars[i] - i represents in which row we are.
                //no sākuma šis izpildāt un līdz ar to printēs pa rindām [0][1]; [0][2]; [0][3]... un izpildat to
                // garumu 5x, tad izprintē tukšo rindiņu zemāk pēc iekavām un tad pāries uz
                // augšējo for pieskaitīs 1 un printēs [1][0]; [1][1]; [1][2]; ...
                System.out.print(dreamCars[i][j] + " ");
            }
            // Ieliks atstarpi starp row
            System.out.println();
        }
        System.out.println("Darbi no 03.03.2023.");
        // Same thing using nested For-Each loops / Look through data stucture which holds diferent arrays2 diam array by each of the row.
        for (String[] rows : dreamCars) {
            System.out.println(Arrays.toString(rows));
        }

        // Cits variants
        for (String[] rows : dreamCars) {
            for (String car : rows) {
                System.out.print(car + " ");
            }

// Cits variants
            System.out.println();

            for (String[] row : dreamCars) {
                for (String car : row) {
                    System.out.print(car + " ");
                }
                System.out.println();
            }
            }
    }
}