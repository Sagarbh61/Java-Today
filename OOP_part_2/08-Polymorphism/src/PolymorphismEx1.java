// Program demonstrating method overriding.
//Method overriding helps to achieve run-time polymorphism

class Animal{
    void sound()
    {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    @Override
    void sound()
    {
        System.out.println("Dog makes a barking sound");
    }
}

public class PolymorphismEx1 {
    public static void main(String[] args)
    {
        Animal a = new Dog();
        a.sound();
    }
}
