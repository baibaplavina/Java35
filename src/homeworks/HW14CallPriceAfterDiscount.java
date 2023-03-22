package homeworks;

import java.util.Scanner;

public class HW14CallPriceAfterDiscount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter good's price: ");
        float price = scanner.nextInt();

        System.out.println("Please enter discount amount (% - percentage)");
        float discount = scanner.nextInt();

        Good good1 = new Good();
         good1.setPrice(price);
         good1.setDiscount(discount);
        good1.priceAfterDiscount;

    }
}
