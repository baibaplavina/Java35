package homeworks;

import java.util.Scanner;

public class HW15_2VAR {

    private static String necessaryInput1 = "rock";
    private static String necessaryInput2 = "paper";
    private static String necessaryInput3 = "scissors";

    private String player1Input;
    private String player2Input;

    public void Inputs(String player1Input, String player2Input) {
        this.player1Input = player1Input;
        this.player2Input = player2Input;
    }

    public void necesaryInput(String necessaryInput1, String necessaryInput2, String necessaryInput3) {
        this.necessaryInput1 = necessaryInput1;
        this.necessaryInput2 = necessaryInput2;
        this.necessaryInput3 = necessaryInput3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player No 1 : Please enter choice between: Rock, Paper, Scissors: ");
        String player1Input = scanner.nextLine().toLowerCase().trim().replaceAll(" ", "");

       System.out.println("Player No 2 : Please enter choice between: Rock, Paper, Scissors: ");
        String player2Input = scanner.nextLine().toLowerCase().trim().replaceAll(" ", "");

        printOutInput(player1Input, player2Input);
        result(player1Input, player2Input, necessaryInput1, necessaryInput2, necessaryInput3);
    }

    private static void printOutInput(String player1Input, String player2Input) {
        System.out.println("Player 1 input " + player1Input + " Player 2 input " + player2Input);
    }

    private static void result(String player1Input, String player2Input, String necessaryInput1, String necessaryInput2, String necessaryInput3) {
        if (player1Input.equals(player2Input)) {
            System.out.println("Result is TIE");
        } else if (player1Input.equals(necessaryInput1) && player2Input.equals(necessaryInput2)) {
            System.out.println("Player 2 wins");
        } else if (player1Input.equals(necessaryInput1) && player2Input.equals(necessaryInput3)) {
            System.out.println("Player 1 wins");
        } else if (player1Input.equals(necessaryInput2) && player2Input.equals(necessaryInput1)) {
            System.out.println("Player 1 wins");
        } else if (player1Input.equals(necessaryInput2) && player2Input.equals(necessaryInput3)) {
            System.out.println("Player 2 wins");
        } else if (player1Input.equals(necessaryInput3) && player2Input.equals(necessaryInput2)) {
            System.out.println("Player 1 wins");
        } else if (player1Input.equals(necessaryInput3) && player2Input.equals(necessaryInput1)) {
                System.out.println("Player 2 wins");
        }
    }
}


