package Controller;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Bank bank = new Bank(); // Create a Bank instance

		int choice;
		int accountNumber;
		double amount;

		while (true) {
			System.out.println("\nWelcome to the Bank !");
			System.out.println("1. Create Account");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Balance Inquiry");
			System.out.println("5. Exit");

			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1: // Create account
				System.out.print("Enter account number: ");
				accountNumber = scanner.nextInt();
				System.out.print("Enter name: ");
				scanner.nextLine(); // Consume newline character
				String name = scanner.nextLine();
				System.out.print("Enter initial balance: ");
				amount = scanner.nextDouble();
				bank.createAccount(accountNumber, name, amount);
				break;
			case 2: // Deposit
				System.out.print("Enter account number: ");
				accountNumber = scanner.nextInt();
				System.out.print("Enter amount to deposit: ");
				amount = scanner.nextDouble();
				bank.deposit(accountNumber, amount);
				break;
			case 3: // Withdraw
				System.out.print("Enter account number: ");
				accountNumber = scanner.nextInt();
				System.out.print("Enter amount to withdraw: ");
				amount = scanner.nextDouble();
				bank.withdraw(accountNumber, amount);
				break;
			case 4: // Balance Inquiry
				System.out.print("Enter account number: ");
				accountNumber = scanner.nextInt();
				double balance = bank.getBalance(accountNumber);
				if (balance != -1.0) { // Check for error value
					System.out.println("Your balance is: " + balance);
				}
				break;
			case 5:
				System.out.println("Exiting Bank Simulator.");
				break;
			default:
				System.out.println("Invalid choice.");
			}

			if (choice == 5) {
				break;
			}
		}
		scanner.close(); // Close Scanner resource
	}
}
