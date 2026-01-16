import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        User user = new User("Sagar Bhattarai", 3000);
        BankAccount acc = new BankAccount("NicAsia101500", 5000);
        BankService service = new BankService();

        int attempts = 0;
        boolean authenticated = false;

        System.out.println("========================================================");
        System.out.println("Welcome to NIC ASIA");
        System.out.println("========================================================");

        while (attempts < 3)
        {
            System.out.println("Enter your pin");
            int pin = sc.nextInt();

            if(user.verifyPin(pin)) {
                authenticated = true;
                break;
            }
            else {
                attempts++;
                System.out.println("Incorrect PIN! Attempt left: "+(3-attempts));

            }
            }
            if(!authenticated)
            {
                System.out.println("Account Locked. Please visit the nearby bank");
                return;
            }
            while(true)
            {
                System.out.println("A/C No: "+acc.getAccountNumber()+"\tA/C holder name: "+ user.getName());
                System.out.println();
                System.out.println("1.Balance\t 2.Deposit \n3.Withdraw\t 4.Exit");
                int choice = sc.nextInt();

                switch (choice)
                {
                    case 1:
                        System.out.println("Your Current Balance: Rs."+acc.getBalance());
                        break;
                    case 2:
                        System.out.println("Enter the amount to deposit\n");
                        service.deposit(acc,sc.nextDouble());
                        break;
                    case 3:
                        System.out.println("Enter the amount to withdraw\n");
                        if(!service.withDraw(acc,sc.nextDouble()))
                        {
                            System.out.println("Insufficient balance");
                        }
                        else{
                            System.out.println("Withdraw successful");
                            break;
                        }
                    case 4:
                        System.out.println("Thank you!");
                        return;
                    default:
                        System.out.println("Invalid option");

                }
            }
    }
}
