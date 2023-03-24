package homeworks;

import java.util.Scanner;

public class HW15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String necessaryInput1 = "rock";
        String necessaryInput2 = "paper";
        String necessaryInput3 = "scissors";

        System.out.println("Player No 1 : Please enter choice between: Rock, Paper, Scissors: ");
        String player1Input = scanner.nextLine().toLowerCase().trim().replaceAll(" ", "");
        validationPlayer1Input(player1Input, necessaryInput1, necessaryInput2, necessaryInput3);

        System.out.println("Player No 2 : Please enter choice between: Rock, Paper, Scissors: ");
        String player2Input = scanner.nextLine().toLowerCase().trim().replaceAll(" ", "");
        validationPlayer2Input(player2Input, necessaryInput1, necessaryInput2, necessaryInput3);

    }

    private static void validationPlayer1Input(String player1Input, String necessaryInput1, String necessaryInput2, String necessaryInput3) {
        while ((!player1Input.equals(necessaryInput1)) || (!player1Input.equals(necessaryInput2)) || (!player1Input.equals(necessaryInput3))) {
            System.out.println("Player No 1 : Please enter choice between: Rock, Paper, Scissors: ");
            player1Input = player1Input;
        }
    }


    private static void validationPlayer2Input(String player2Input, String necessaryInput1, String necessaryInput2, String necessaryInput3) {
        while ((!player2Input.equals(necessaryInput1)) && (!player2Input.equals(necessaryInput2)) && (!player2Input.equals(necessaryInput3))) {
            System.out.println("Player No 2 : Please enter choice between: Rock, Paper, Scissors: ");
            player2Input = player2Input;
        }
    }


}




       /*  (isInputCorrectAnsw1.matches("rock |paper | scissors")){
            System.out.println("Get player No1 choice");
        }else {
            System.out.println("Please enter Rock, Paper or Scissors ");
        }

        System.out.println("Player No 2: Please enter choice between: Rock, Paper, Scissors: ");
        String player2 = scanner.nextLine();

        String isInputCorrectAnsw2 = player2;

        if (isInputCorrectAnsw2.matches("rock |paper | scissors")){
            System.out.println("Get player No2 choice");
        }else {
            System.out.println("Please enter Rock, Paper or Scissors ");
        }*/
        /*public String rock;
        private String paper;
        private String scissors;*/


        //Mathod
       // public static String rockPaperScissors (String player1, String player2){

            // Validation: odd, upercase,lowercase. Invalid input.
            //Example structure Book file - if the input valid
            // Paste as text message
       // }