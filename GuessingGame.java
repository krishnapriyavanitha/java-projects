
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numberToGuess = random.nextInt(100) + 1; // Generates 1 to 100
        int numberOfTries = 0;
        int userGuess = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("--- Welcome to the Number Guessing Game! ---");
        System.out.println("I have picked a number between 1 and 100.");
        System.out.println("Can you guess what it is?");

        // Loop runs until the user guesses the correct number
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            numberOfTries++;

            if (userGuess < 1 || userGuess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You found the number in " + numberOfTries + " tries.");
            }
        }

        scanner.close();
    }
}