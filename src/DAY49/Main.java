package DAY49;

public class Main {
    public static void main(String[] args) {
        // Bank Account Assignment
        BankAccount bradBankAccount = new BankAccount(500, "Brad");

        bradBankAccount.deposit( 100);
        bradBankAccount.accDetails();

        // Bank Transfer Assignment
        BankAccount account1 = new BankAccount(5000, "Bob");
        BankAccount account2 = new BankAccount(300, "Harry");

        // withdrawal still worked and it changed to amtWithdrawn when clicking the option. COOL
        account1.withdrawal(100);
        account2.deposit(100);

        account1.accDetails();
        account2.accDetails();



    }
}

