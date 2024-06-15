//Kenneth Smith Assingemnt 3.2 6-13-24
//This program is intended to be a game of Rock-Paper-Scissors

import java.util.Scanner;

public class rock_paper_scissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Generate a random number between 1 and 3 for the computer's choice
        int computerChoice = (int) (Math.random() * 3) + 1;

        // Prompt the user to enter a choice
        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.println("Enter your choice: 1 for Rock, 2 for Paper, 3 for Scissors");
        int userChoice = scanner.nextInt();

        // Display the computer's choice
        System.out.print("Computer's choice: ");
        switch (computerChoice) {
            case 1:
                System.out.println("Rock");
                break;
            case 2:
                System.out.println("Paper");
                break;
            case 3:
                System.out.println("Scissors");
                break;
        }

        // Display the user's choice
        System.out.print("Your choice: ");
        switch (userChoice) {
            case 1:
                System.out.println("Rock");
                break;
            case 2:
                System.out.println("Paper");
                break;
            case 3:
                System.out.println("Scissors");
                break;
            default:
                System.out.println("Invalid choice");
                return; // Exit if the user's choice is invalid
        }

        // Determine the result
        if (computerChoice == userChoice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 1 && computerChoice == 3) ||
                   (userChoice == 2 && computerChoice == 1) ||
                   (userChoice == 3 && computerChoice == 2)) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }

        // Close the scanner
        scanner.close();
    }
}
