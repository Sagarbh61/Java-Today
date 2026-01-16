public class BankService{
    public void deposit(BankAccount acc, double amount)
    {
        acc.deposit(amount);
    }
    public boolean withDraw(BankAccount acc, double amount)
    {
       return acc.withDraw(amount);

    }
}