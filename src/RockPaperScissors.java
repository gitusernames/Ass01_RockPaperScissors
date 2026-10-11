import java.util.Scanner;

public class RockPaperScissors {
    static void main() {
        String playerA;
        String playerB;
        String continueYN;
        Scanner in = new Scanner(System.in);
        boolean done;
        do {
            done = false;
            do {
                System.out.print("Player A: Choose R for rock, P for paper, or S for scissors: ");
                playerA = in.nextLine();
                if (playerA.matches("[RPSrps]")) {
                    done = true;
                } else {
                    System.out.println("You typed " + playerA + ". Please choose R, P, or S.");
                }
            } while (!done);
            done = false;
            do {
                System.out.print("Player B: Choose R for rock, P for paper, or S for scissors: ");
                playerB = in.nextLine();
                if (playerB.matches("[RPSrps]")) {
                    done = true;
                } else {
                    System.out.println("You typed " + playerB + ". Please choose R, P, or S.");
                }
            } while (!done);
            if (playerA.equalsIgnoreCase("R")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs Rock. It's a tie!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers Rock. Player B wins!");
                } else {
                    System.out.println("Rock breaks Scissors. Player A wins!");
                }
            } else if (playerA.equalsIgnoreCase("P")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock. Player A wins!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper vs Paper. It's a tie!");
                } else {
                    System.out.println("Scissors cuts Paper. Player B wins!");
                }
            } else {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks Scissors. Player B wins!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cuts Paper. Player A wins!");
                } else {
                    System.out.println("Scissors vs Scissors. It's a tie!");
                }
            }
            System.out.print("Would you like to play again [Y/N]?: ");
            continueYN = in.nextLine();
        } while (continueYN.equalsIgnoreCase("Y"));
    }
}