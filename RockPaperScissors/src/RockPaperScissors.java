import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String[] rps = {"rock", "paper", "scissors"};

        Scanner scanner = new Scanner(System.in);
        // get user's choice
        System.out.println("Enter your choice (rock, paper, scissors):");
        String userchoice = scanner.nextLine();

        // random choice for the computer
        Random random = new Random();
        int randomIndex = random.nextInt(rps.length);
        String computerPick = rps[randomIndex];

        // print computer's choice
        System.out.println("Computer chose: " + computerPick);

        // determine rules and print result
        if (userchoice.equalsIgnoreCase(computerPick)) {
            System.out.println("It's a tie!");

        } else if (userchoice.equalsIgnoreCase("rock") && (ComputerPick.equals("paper")) ||
                (userchoice.equalsIgnoreCase("paper") && computerPick.equalsIgnoreCase("scissors")) ||
                (userchoice.equalsIgnoreCase("scissors")) && computerPick.equalsIgnoreCase("rock")) {
            System.out.println("You Lose!");
        } else {
            System.out.println("You Win!");
        }
        System.out.println("Do you want to play again? yes/no");
        playAgain = scanner.nextLine();
    } while (playAgain = "yes");

    System.out.println("Thanks for playing!");
    scanner.close()

    }
}
