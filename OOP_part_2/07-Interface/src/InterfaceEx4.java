//Interfaces can have default methods

interface Vehicle{
    default void fuelType()
    {
        System.out.println("Uses diesel or petrol");
    }
    void start();
}

class Car implements Vehicle{
    @Override
    public void start()
    {
        System.out.println("Car starts using a key");
    }
}

public class InterfaceEx4 {
    public static void main(String[] args)
    {
        Car suzuki = new Car();
        suzuki.start();
        suzuki.fuelType();
    }
}
