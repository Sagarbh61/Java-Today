public class BankAccount{
    private final String accountNumber;
    private double balance;

    public BankAccount(String accNo, double initialAmount)
    {
        this.accountNumber = accNo;
        this.balance = initialAmount;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amount)
    {
        if( amount <= 0)
        {
            System.out.println("Deposit must be positive");
            return;
        }
        balance+=amount;
    }

    public boolean withDraw(double amount)
    {
        if(amount <=0 || amount>balance)
            return false;
        balance-=amount;
            return true;
    }
}