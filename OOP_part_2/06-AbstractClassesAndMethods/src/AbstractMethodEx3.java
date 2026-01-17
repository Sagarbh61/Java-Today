//Until now, all our abstract classes have had abstract methods, but they can have normal
//or regular methods too

abstract class Vehicle{
    abstract void start();

    void fuelType()
    {
        System.out.println("Uses fuel");
    }
}

class Bike extends Vehicle{
    @Override
    void start()
    {
        System.out.println("Bike starts with a kick");
    }
}
public class AbstractMethodEx3 {
    public static void main(String[] args)
    {
        Bike b = new Bike();
        b.start();
        b.fuelType();
    }
}
