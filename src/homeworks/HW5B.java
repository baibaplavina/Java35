package homeworks;

import java.util.Scanner;
public class HW5B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter necessary amount of jam between 0 kg and 42 kg");

        // If necessary amount is <= 0 or >= 42
        int necessaryAmount;
        necessaryAmount = scanner.nextInt();

        int i = 0;
        while ((necessaryAmount >= 42) || (necessaryAmount <= 0)) {
            System.out.println("Please enter necessary amount of jam between 0 kg and 42 kg");
        }

        int jar7kg = 7;
        int jarNumber = 6;

        // Necessary number of 7kg jars:
        int necessaryDividedAmountJar7kg = necessaryAmount / jar7kg;
        System.out.println("7 kg jars No: " + (necessaryDividedAmountJar7kg));

        //Possible number of 1kg jars:
        int possibleAmountOf1kgjars = jarNumber - necessaryDividedAmountJar7kg;
        System.out.println("Possible 1 kg jars No: " + possibleAmountOf1kgjars);

        //Necessary number of 1kg jars:
        int necessaryAmountOf1kgJars = necessaryAmount - necessaryDividedAmountJar7kg * jar7kg;
        System.out.println("Necessary amount of 1 kg jars No: " + necessaryAmountOf1kgJars);

        System.out.println("Can John bring necessary amount of jam? " + (necessaryAmountOf1kgJars <= possibleAmountOf1kgjars));

    }
}