class Vehicle{

    void start()
    {
        System.out.println("Vehicle is starting");
    }
}

class Bike extends Vehicle{
    @Override
    void start(){
        super.start();
        System.out.println("Bike starts with a kick");
    }
}

public class UseOfSuper_02 {
    public static void main(String[] args){
        Bike b = new Bike();
        b.start();
    }
}
