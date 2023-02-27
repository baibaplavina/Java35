package homeworks;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter necessary amount of jam ");

        int necessaryAmount = scanner.nextInt();
        int jar7kg =7;
        int jarNumber =6;

        // Necessary number of 7kg jars:
        int necessaryDividedAmountJar7kg = necessaryAmount/jar7kg;
        System.out.println("7 kg jars No: " + (necessaryDividedAmountJar7kg));

        //Possible number of 1kg jars:
        int possibleAmountOf1kgjars = jarNumber - necessaryDividedAmountJar7kg;
        System.out.println("Possible 1 kg jars No: " + possibleAmountOf1kgjars);

        //Necessary number of 1kg jars: 
        int necessaryAmountOf1kgJars = necessaryAmount - necessaryDividedAmountJar7kg * jar7kg;
        System.out.println("Necessary amount of 1 kg jars No: " + necessaryAmountOf1kgJars);

        System.out.println("Can John bring necessary amount of jam? "+ (necessaryAmountOf1kgJars<=possibleAmountOf1kgjars));
        }


               /*      Alex is an owner of grocery store. Among many products he sells,
        he's mostly famous for his hand-made jam, that is being
        sold in jars of 1kg or 7kg. Alex sells only full jars
        (i.e. it's only possible to buy the whole jar of 1kg, or 7kg).

        Will is asked by his wife Jane to buy some amount of Alex's jam.
        Will forgot to take his bag, thus he can take home no more than six jars of jam
        (three jars in each of his two hands). Jane is very serious about the
        shopping list - if she asked for specific amount of jam, she expects exactly this
        amount, no more, no less.

        Write an application that will check if Will is able to take home the
        amount of jam specified by Jane. Amount of jam should be read from user
        (positive int value). You can assume that there's always enough jam in Alex's shop.
        Your application should print true or false.*/
    }
