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
        System.out.println("Computer chose: " + computerPick );

        // determine rules and print result
        if (userchoice.equalsIgnoreCase(computerPick));
        System.out.println("It's a tie!");

        else if (userchoice.equalsIgnoreCase("rock")) && (ComputerPick.equals ("paper"));
        System.out.println("You lose!");
        









        }
    }
}
