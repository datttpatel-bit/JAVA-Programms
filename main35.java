//pr4.2
// Create a Java class BankAccount with accountNumber, accountHolderName, 
// and balance. Include methods to deposit, withdraw, and display balance. Use a
// BankDemo class to test all methods.

import java.util.Scanner;
class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Successfully deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Successfully withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: " + balance);
    }
}

public class main35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder name: ");
        String accountHolderName = sc.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        BankAccount acc1 = new BankAccount(accountNumber, accountHolderName, balance);

        acc1.displayBalance();

        System.out.print("Enter amount to deposit: ");
        double depositAmt = sc.nextDouble();
        acc1.deposit(depositAmt);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmt = sc.nextDouble();
        acc1.withdraw(withdrawAmt);
        acc1.displayBalance();
    }
}