package Controller;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts; // List to store accounts

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void createAccount(int accountNumber, String name, double balance) {
        // Add validation checks (optional)
        accounts.add(new Account(accountNumber, name, balance));
    }

    public Account findAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null; // Account not found
    }
    
 // Delegate core functionalities to the Account class
    public void deposit(int accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }
    
    public void withdraw(int accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }
    
    public double getBalance(int accountNumber) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            return account.getBalance();
        } else {
            System.out.println("Account not found.");
            return -1.0; // Or any error value
        }
    }

}