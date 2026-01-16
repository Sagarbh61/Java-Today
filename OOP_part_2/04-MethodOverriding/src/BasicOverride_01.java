//This program demonstrates method overriding using override keyword

class Animal
{
    void sound()
    {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    @Override
    void sound()
    {
        System.out.println("Dog makes barking sound");
    }
}
public class BasicOverride_01 {
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        dog.sound();
    }
}
/*
Note: Here, both superclass and subclass have the same method signature, but the superclass's method is overridden by the subclass
 */