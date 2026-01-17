//Interface reference holding object
interface Payment{
    void pay();
}

class Esewa implements Payment{
    @Override
    public void pay()
    {
        System.out.println("Payment done via eSewa");
    }
}

public class InterfaceEx3 {
    public static void main(String[] args)
    {
        Payment p = new Esewa();
        p.pay();
    }
}
