package JavaProgramming;
import java.util.Random;
import java.util.Scanner;
public class GuessUserNo {

	public static void main(String[] args) {
		Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        // Generate random number between 1 and 100
        int randomNumber = rand.nextInt(100) + 1;

        // Ask user for their guess
        System.out.print("Enter your guess (1-100): ");
        int guess = sc.nextInt();

        System.out.println("You guessed: " + guess);
        System.out.println("The actual number was: " + randomNumber);
        sc.close();
    }
}