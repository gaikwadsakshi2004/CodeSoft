package JavaProgramming;
import java.util.*;
public class CurrencyConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Step 1: Currency Selection
        System.out.print("Enter base currency (USD/INR): ");
        String base = sc.next().toUpperCase();

        System.out.print("Enter target currency (USD/INR): ");
        String target = sc.next().toUpperCase();

        // Step 2: Amount Input
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        // Step 3: Conversion rates (fixed for example)
        double rate = 1.0;
        if (base.equals("USD") && target.equals("INR")) {
            rate = 83.0; // 1 USD = 83 INR
        } else if (base.equals("INR") && target.equals("USD")) {
            rate = 0.012; // 1 INR = 0.012 USD
        } else if (base.equals(target)) {
            rate = 1.0; // Same currency
        } else {
            System.out.println("Conversion not available.");
            sc.close();
            return;
        }

        // Step 4: Conversion
        double result = amount * rate;

        // Step 5: Display Result
        System.out.printf("%.2f %s = %.2f %s\n", amount, base, result, target);

        sc.close();
    }
}
