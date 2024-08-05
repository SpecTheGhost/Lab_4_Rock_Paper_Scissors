import java.util.Scanner;
public class Main
{ public static void main(String[] args)
    {Scanner in = new Scanner(System.in);
        String player1;
        String player2 = "P";
        String yesNo;
        boolean validMoveP1;
        boolean validMoveP2;
        boolean validYesNo;
        boolean playAgain = false;
        do {
            do {
                System.out.println("Player One: choose Rock, Paper, or Scissors");
                player1 = in.nextLine();
                player1 = player1.toUpperCase();

                if (player1.equals("R") || player1.equals("P") || player1.equals("S")) {
                    validMoveP1 = true;
                    do {
                        System.out.println("Player Two: choose Rock, Paper, or Scissors");
                        player2 = in.nextLine();
                        player2 = player2.toUpperCase();

                        if (player2.equals("R") || player2.equals("P") || player2.equals("S")) {
                            validMoveP2 = true;
                        } else {
                            validMoveP2 = false;
                            System.out.println("Please input either R, P, or S");
                        }
                    } while (!validMoveP2);
                } else {
                    validMoveP1 = false;
                    System.out.println("Please input either R, P, or S");
                }
            } while (!validMoveP1);
            if (player1.equals("R")) {
                if (player2.equals("R")) {
                    System.out.println("Rock vs Rock! Its a tie!");
                } else if (player2.equals("P")) {
                    System.out.println("Paper covers Rock! Player Two wins!");
                } else //player2 is SCISSORS
                {
                    System.out.println("Rock crushes Scissors! Player One wins!");
                }
            } else if (player1.equals("P")) {
                if (player2.equals("R")) {
                    System.out.println("Paper covers Rock! Player One wins!");
                } else if (player2.equals("P")) {
                    System.out.println("Paper vs Paper! Its a tie!");
                } else
                {
                    System.out.println("Scissors cuts Paper Player2 wins!");
                }
            } else
            {
                if (player2.equals("R")) {
                    System.out.println("Rock crushes Scissors! Player Two wins!");
                } else if (player2.equals("P")) {
                    System.out.println("Scissors cuts Paper! Player One wins!");
                } else
                {
                    System.out.println("Scissors vs Scissors! Its a tie!");
                }
            }

            do {
                System.out.println("Do you want to play again? [Y/N]");
                yesNo = in.nextLine();
                yesNo = yesNo.toUpperCase();

                if (yesNo.equals("Y")) {
                    validYesNo = true;
                    playAgain = true;
                    System.out.println("Starting again");
                } else if (yesNo.equals("N")) {
                    validYesNo = true;
                    playAgain = false;
                    System.out.println("Shutting down");
                } else {
                    System.out.println("Please input Y or N");
                    validYesNo = false;
                }
            }while(!validYesNo);
        }while(playAgain);
    }
}