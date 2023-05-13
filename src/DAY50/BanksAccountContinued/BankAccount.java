package DAY50.BanksAccountContinued;

import java.util.Scanner;
import java.util.ArrayList;

public class BankAccount {

    // Two attributes
    private double bankAccountBalance;

    private String accountHolderName;

    private int accountNumber;

    // Constructor
    public BankAccount(double bankAccountBalance, String accountHolderName, int accountNumber) {
        this.bankAccountBalance = bankAccountBalance;
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    public BankAccount() {
        // BankAccountContinued Assignment
        // Constructor for new account & allows for the user to input Name and Starting account balance
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello World! Welcome to the Bank of Matt!\n" + "Are you an existing customer?(-1 to exit)\n" + "1. Yes \n" + "2. No");
        int existingCustomerInput = scanner.nextInt();

        switch(existingCustomerInput) {
            case 1:
                System.out.println("Hello loyal customer!");
                break;
            case 2:
                System.out.println("What is the name for the account?");
                this.accountHolderName = scanner.nextLine();
                scanner.nextLine();
                System.out.println("What is the beginning balance for the account?");
                this.bankAccountBalance = scanner.nextDouble();
                this.accountNumber = -1;
                break;
            case -1:
                System.out.println("Thanks for stopping by.");
                break;
        }
    }


    // 3 Methods
    public void deposit(double amount) {
        bankAccountBalance = bankAccountBalance + amount;

    }
    public void withdrawal(double amtWithdrawn) {
        bankAccountBalance = bankAccountBalance - amtWithdrawn;
    }

    public void accDetails() {
        System.out.println(accountHolderName + "'s account balance: " + bankAccountBalance);
    }

    // BankAccountsContinued Additional 2 methods
    public void deposit2(double amount) {
        bankAccountBalance = bankAccountBalance + amount;
    }

    public void withdrawal2(double amtWithdrawn) {
        bankAccountBalance = bankAccountBalance - amtWithdrawn;
    }

    // Transfer method
    public void transfer(BankAccount otherAccount, double amountToTransfer) {
        if(bankAccountBalance < amountToTransfer) {
            System.out.println("No enough available funds");
        }

        withdrawal(amountToTransfer);

        otherAccount.deposit(amountToTransfer);

        printAccountDetails();
        otherAccount.printAccountDetails();
    }

    // getter
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void printAccountDetails() {
        System.out.println("Account Number: " + this.accountNumber + "\n" + "" + this.accountHolderName + " hasa balance of: " + this.bankAccountBalance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBankAccountBalance() {
        return bankAccountBalance;
    }

    public void setAccountNumber( int accountNumber) {
        this.accountNumber = accountNumber;
    }

}
