package Task_1;

public class Demo {

        // Your variable declarations and code here

        public static void main(String[] args) {
            double initialBalance1 =1000;
            double initialBalance2 = 2000;
            BankAccount account1 = new BankAccount(initialBalance1);
            BankAccount account2 = new BankAccount(initialBalance2);

            System.out.println(" initial balance: " + initialBalance1);
            System.out.println(" initial balance: " + initialBalance2);


            account1.deposit(500);
            account2.withdraw(800);


            System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
            System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

            System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
        }
    }

