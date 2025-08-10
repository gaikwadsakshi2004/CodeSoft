package JavaProgramming;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println(" Welcome to CodSoft Task 1 - Number Guessing Game...");
        String playAgain = "yes"; // Control game loop
        while (playAgain.equalsIgnoreCase("yes")) {

            int secretNumber = random.nextInt(100) + 1; // 1 to 100
            int attempts = 0;
            int maxAttempts = 5;

            System.out.println("\nI’m Thinking a Number between 1 and 100");
            System.out.println("You have " + maxAttempts + " attempts to guess it!");
            System.out.println("\n....Let Start To Play....");
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == secretNumber) {
                    System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Too low! Attempts left: " + (maxAttempts - attempts));
                } else {
                    System.out.println("Too high! Attempts left: " + (maxAttempts - attempts));
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("Out of attempts! The number was: " + secretNumber);
            }

            System.out.print("\nDo you want to play again?(yes/no): ");
            playAgain = sc.next();
        }

        System.out.println("\nThank You for playing! See you soon!");
        sc.close();
    }
}
