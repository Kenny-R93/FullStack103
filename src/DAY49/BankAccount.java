package DAY49;

public class BankAccount {

    private double bankAccountBalance;

    private String accountHolderName;

    public BankAccount(double bankAccountBalance, String accountHolderName) {
        this.bankAccountBalance = bankAccountBalance;
        this.accountHolderName = accountHolderName;
    }

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
