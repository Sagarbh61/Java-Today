//Polymorphism using interface

interface Payment{
    void pay();
}

class Esewa implements Payment{
    @Override
    public void pay() {
        System.out.println("Payment done via eSewa");
    }
}
class Khalti implements Payment{
    @Override
    public void pay()
    {
        System.out.println("Payment done via khalti");
    }
}
public class PolymorphismEx4 {
    public static void main(String[] args)
    {
        Payment p1 = new Esewa();
        Payment p2 = new Khalti();
        p1.pay();
        p2.pay();
    }
}
