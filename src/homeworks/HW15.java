package homeworks;

import java.util.Scanner;

public class HW15 {

       private static String necessaryInput1 = "rock";
       private static String necessaryInput2 = "paper";
       private static String necessaryInput3 = "scissors";

       private String player1Input;
       private String player2Input;

       public void Inputs (String player1Input, String player2Input){
       this.player1Input = player1Input;
       this.player2Input = player2Input;
       }

       public void necesaryInput (String necessaryInput1, String necessaryInput2, String necessaryInput3 ){
         this.necessaryInput1 = necessaryInput1;
         this.necessaryInput2 = necessaryInput2;
         this.necessaryInput3 = necessaryInput3;
        }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player No 1 : Please enter choice between: Rock, Paper, Scissors: ");
        String player1Input = scanner.nextLine().toLowerCase().trim().replaceAll(" ", "");

        validationPlayer1Input(player1Input, necessaryInput1, necessaryInput2, necessaryInput3);

        System.out.println("Player No 2 : Please enter choice between: Rock, Paper, Scissors: ");
        String player2Input = scanner.nextLine().toLowerCase().trim().replaceAll(" ", "");
        validationPlayer2Input(player2Input, necessaryInput1, necessaryInput2, necessaryInput3);

        printOutResult(player1Input, player2Input);

    }


    private static boolean isInput1Correct(String player1Input){

           return (!player1Input.equals(necessaryInput1)) && (!player1Input.equals(necessaryInput2)) && (!player1Input.equals(necessaryInput3));
    }

    private static void validationPlayer1Input(String player1Input, String necessaryInput1, String necessaryInput2, String necessaryInput3) {
        while (isInput1Correct(player1Input)) {
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
private static void printOutResult(String player1Input, String player2Input) {

    System.out.println("Player 1 input " + player1Input + "Player 2 input " + player2Input + "result");
   }

  /*      ("rock", "paper") ➞ "Player 2 wins"
("paper", "rock") ➞ "Player 1 wins"
("paper", "scissors") ➞ "Player 2 wins"
 ("scissors", "scissors") ➞ "TIE"
("scissors", "paper") ➞ "Player 1 wins"*/


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

