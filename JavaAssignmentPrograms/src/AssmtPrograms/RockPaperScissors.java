package AssmtPrograms;
import java.util.Scanner;

public class RockPaperScissors {

    /*
    Implement a simple rock, paper, scissors game in Java Scanner the user to enter their choice, and use conditional statements to determine the winner based on the game rules (rock beats scissors, scissors beat paper, paper beats rock).
     */

    private static String generateComputerChoice() {
        int random = (int) (Math.random() * 3);
        switch (random) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            default:
                return "scissors";
        }
    }

    private static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "It's a tie!";
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock"))) {
            return "You win!";
        } else {
            return "Computer wins!";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your choice (rock, paper, or scissors) or 'exit' to quit:");
            String userChoice = scanner.nextLine().toLowerCase();

            if (userChoice.equals("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid choice. Please enter 'rock', 'paper', or 'scissors'.");
                continue;
            }

            String computerChoice = generateComputerChoice();

            System.out.println("Computer's choice: " + computerChoice);

            String result = determineWinner(userChoice, computerChoice);
            System.out.println(result);
        }

        scanner.close();
    }
}
