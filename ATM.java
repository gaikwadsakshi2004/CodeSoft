package JavaProgramming;

	import java.util.Scanner;

	class BankAccount {
	    double balance;

	    BankAccount(double balance) {
	        this.balance = balance;
	    }

	    void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited: ₹" + amount);
	    }

	    void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: ₹" + amount);
	        } else {
	            System.out.println("Not enough balance!");
	        }
	    }

	    void checkBalance() {
	        System.out.println("Current Balance: ₹" + balance);
	    }
	}

	class ATMM{
	    BankAccount account;

	    ATMM(BankAccount account) {
	        this.account = account;
	    }

	    void menu() {
	        System.out.println("\n1. Check Balance");
	        System.out.println("2. Deposit");
	        System.out.println("3. Withdraw");
	        System.out.println("4. Exit");
	        System.out.print("Choose: ");
	    }
	}

	public class ATM{
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        BankAccount acc = new BankAccount(5000);
	        ATMM atm = new ATMM(acc);

	        while (true) {
	            atm.menu();
	            int choice = sc.nextInt();

	            if (choice == 1) {
	                acc.checkBalance();
	            } else if (choice == 2) {
	                System.out.print("Enter amount to deposit: ");
	                acc.deposit(sc.nextDouble());
	            } else if (choice == 3) {
	                System.out.print("Enter amount to withdraw: ");
	                acc.withdraw(sc.nextDouble());
	            } else if (choice == 4) {
	                System.out.println("Thank you!");
	                break;
	            } else {
	                System.out.println("Invalid choice!");
	            }
	        }
	        sc.close();
	    }
	}

