package basics;

public class StringValidation {
    public static void main(String[] args) {

        //Check if this text is equal to ("Bike or Car or Plane")

        String text = "Bike";

        //== use with primitive data type
        //text.matches in scopes atdala ar |
        System.out.println(text.equals("Bike") || text.equals("Car") || text.equals("Plane"));
        System.out.println(text.matches("Bike|Car|Plane"));

    }
}
