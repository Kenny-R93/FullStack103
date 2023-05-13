package DAY49;

public class BankAccount {

    // Two attributes
    private double bankAccountBalance;

    private String accountHolderName;

    // Constructor
    public BankAccount(double bankAccountBalance, String accountHolderName) {
        this.bankAccountBalance = bankAccountBalance;
        this.accountHolderName = accountHolderName;
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




}
