//A simple program on the real world behavior taking Bank Account as example

public class BankAccount {
    String accountHolder;
    double balance;

    void deposit(double amount)
    {
        balance+=amount;
    }
    void withDraw(double amount)
    {
        if(amount <= balance)
        {
            balance -= amount;
        }
        else
            System.out.println("Insufficient balance");
    }
    void accountDetails()
    {
        System.out.println("Account Holder Name: "+accountHolder+"\nCurrent Balance: Rs."+balance);
    }
    public static void main(String[] args)
    {
        BankAccount acc = new BankAccount();
        acc.accountHolder = "Sagar Bhattarai";
        acc.balance = 6000;
        acc.deposit(2000);
        acc.withDraw(5000);
        acc.accountDetails();
    }
}
/*
Note:
1) Demonstrates a simple BankAccount class with instance variables for accountHolder and balance.
2) Provides methods to deposit, withdraw, and view the account balance.
3) Uses object of the class to call methods via the dot (.) operator.
4) Withdraw method includes a basic check to prevent overdrawing the account.
*/
