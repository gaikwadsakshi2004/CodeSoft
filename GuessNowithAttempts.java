package JavaProgramming;
import java.util.Random;
import java.util.Scanner;

public class GuessNowithAttempts {

	public static void main(String[] args) {
		Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int randomNumber = rand.nextInt(100) + 1; // Random number 1-100
        int maxAttempts = 5; // Limit attempts
        int attemptsUsed = 0;

        System.out.println(" Guess the number between 1 and 100!");
        System.out.println("You have " + maxAttempts + " attempts.");

        while (attemptsUsed < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            attemptsUsed++;

            if (guess == randomNumber) {
                System.out.println("Correct! You guessed the number in " + attemptsUsed + " attempts.");
                break;
            } else if (guess > randomNumber) {
                System.out.println(" Too high! Attempts left: " + (maxAttempts - attemptsUsed));
            } else {
                System.out.println(" Too low! Attempts left: " + (maxAttempts - attemptsUsed));
            }
        }

        if (attemptsUsed == maxAttempts) {
            System.out.println(" Game Over! The number was: " + randomNumber);
            sc.close();
        }
    }
}
	