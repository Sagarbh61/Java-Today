// Polymorphism using array

class Animal{
    void sound()
    {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    @Override
    void sound()
    {
        System.out.println("Cat meows");
    }
}

class Cow extends Animal{
    @Override
    void sound()
    {
        System.out.println("Cow moos");
    }
}

public class PolymorphismEx5 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog(),
                new Cat(),
                new Cow()
        };

        for(Animal a:animals)
        {
            a.sound(); //passing sound method for all animal objects
        }
    }
}
