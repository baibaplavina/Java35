package homeworks;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter speed in mp/h");

        float miles = scanner.nextFloat();
        System.out.println(miles + " mp/h in km/h would be equal to " + (miles * 1.609344f) + " km");

        // Using scanner read speed in mp/h
        // Calculate and output speed in km/h
        // Example with input 122.7 mp/h
        // Output --> 122.7 mp/h in km/h would be equal to 197.46651
        //number can be with decimals. Decimalus atdala ar punktu (.) Ievadot datus var būt ka jāatdala ar komatu.
        // float speedMph = scanner.nextFloat();
        // float speedKmh = speedMph * 1.609344f;
        //System.out.println(speedMph + "mp/h in km/h would be equal to " + speedKmp);

    }
}
