package homeworks;

import java.util.Scanner;

public class HW15partscheck {
    public static void main(String[] args) {


        String necessaryInput1 = "rock";
        String necessaryInput2 = "paper";
        String necessaryInput3 = "scissors";

        System.out.println("Player No 1 : Please enter choice between: Rock, Paper, Scissors: ");
        Scanner scanner = new Scanner(System.in);
        String player1Input = scanner.nextLine().toLowerCase().trim().replaceAll(" ", "");

        while ((!player1Input.equals(necessaryInput1)) && (!player1Input.equals(necessaryInput2)) && (!player1Input.equals(necessaryInput3))) {
            System.out.println("Player No 1 : Please enter choice between: Rock, Paper, Scissors: ");
            player1Input = scanner.nextLine().toLowerCase().trim().replaceAll(" ", "");
        }

        // System.out.println("Player No 2 : Please enter choice between: Rock, Paper, Scissors: ");
        String player2Input = scanner.nextLine().toLowerCase().trim().replaceAll(" ", "");
        while ((!player2Input.equals(necessaryInput1)) && (!player2Input.equals(necessaryInput2)) && (!player2Input.equals(necessaryInput3))) {
            System.out.println("Player No 2 : Please enter choice between: Rock, Paper, Scissors: ");
            player2Input = scanner.nextLine().toLowerCase().trim().replaceAll(" ", "");
        }
    }
}