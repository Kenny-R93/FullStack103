package DAY50.BanksAccountContinued;


import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Bank Accounts Continued Assignment
        Scanner scanner = new Scanner(System.in);
        ArrayList<BankAccount> accountList = new ArrayList<>();


        // Bank Account Assignment
        BankAccount ObiwanK = new BankAccount(500, "Obiwan Kenobi",0);


        ObiwanK.deposit( 100);
        ObiwanK.accDetails();

        // Bank Transfer Assignment
        BankAccount LukeS = new BankAccount(5000, "Luke Skywalker",1);
        BankAccount LeiaO = new BankAccount(300, "Leia Organa",3);

        // withdrawal still worked and it changed to amtWithdrawn when clicking the option. COOL
        LukeS.withdrawal(100);
        LeiaO.deposit(100);

        LukeS.accDetails();
        LeiaO.accDetails();

        // Product Assignment

        Product proteinPowder = new Product(4, 10,"proteinPowder");

        proteinPowder.printProduct();
        proteinPowder.totalCost();

        accountList.add(ObiwanK);
        accountList.add(LukeS);
        accountList.add(LeiaO);

        BankAccount currentAccount = new BankAccount();
        currentAccount.setAccountNumber(4);
        accountList.add(currentAccount);

    }
    // Bank Accounts Continued Assignment
    public static void mainMenu(BankAccount currentAccount, ArrayList<BankAccount> accountList) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Hello " + currentAccount.getAccountHolderName() + "!");
            System.out.println("Welcome to the Main menu, what would you like to do today?\n" +
                    "1. Check Account Balance\n" +
                    "2. To make a withdraw\n" +
                    "3. To make a deposit\n" +
                    "4. To make a transfer to an another account\n" +
                    "0. To exit.\n");
            int existingCustomerInput = scanner.nextInt();

            switch(existingCustomerInput) {
                case 1:
                    currentAccount.printAccountDetails();
                    break;
                case 2:
                    System.out.println("How much would you like to withdrawal?");
                    double amtWithdrawn = scanner.nextDouble();
                    currentAccount.withdrawal(amtWithdrawn);
                    currentAccount.printAccountDetails();
                    break;
                case 3:
                    System.out.println("How much would you like to deposit?");
                    double depositAmt = scanner.nextDouble();
                    currentAccount.deposit(depositAmt);
                    currentAccount.printAccountDetails();
                    break;
                case 4:
                    System.out.println("Enter the account number you wish to transfer money to: ");
                    int transferAccNumber = scanner.nextInt();

                    BankAccount transferAccount = findAccount (transferAccNumber, accountList);

                    if(transferAccount == null) {
                        System.out.println("Account doesn't exist");
                        break;
                    }

                    System.out.println("Please enter the amount to transfer: ");
                    double transferAmt = scanner.nextDouble();

                    currentAccount.transfer(transferAccount, transferAmt    );
                    break;

                case 0:
                    System.out.println("Thank you for being a loyal customer! We look forward to serving you again soon.");
                    return;

                default:
                    System.out.println("Enter a valid option (1-4; or 0 to exit.)");
                    break;
            }
        }
    }

    // Option 4: Find account
    public static BankAccount findAccount(int accountNumber, ArrayList<BankAccount> accountList) {
        for (BankAccount account: accountList) {
            if(account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }
}