abstract class Animal{
    abstract void sound();
}

class Dog extends Animal{
    @Override
    void sound()
    {
        System.out.println("Dog barks");
    }
}
public class AbstractMethodEx1 {
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        dog.sound();
    }
}
/*
Key points:
- Abstract methods have no body
- Child class must implement them
 */