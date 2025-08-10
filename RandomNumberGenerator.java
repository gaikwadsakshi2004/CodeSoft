package JavaProgramming;
import java.util.Random;

public class RandomNumberGenerator {
	public static void main(String[] args) {
        Random rand = new Random();

        // Generates a number from 1 to 100
        int randomNumber = rand.nextInt(100) + 1;

        System.out.println(" The Random Number is: " + randomNumber);
    }
}