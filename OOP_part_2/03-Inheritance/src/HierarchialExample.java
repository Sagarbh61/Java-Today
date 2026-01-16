class Cat extends Animal{
    void display()
    {
        System.out.println("My name is "+name);
    }

    void meow()
    {
        System.out.println("I can meow");
    }
}

public class HierarchialExample {
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        dog.name = "doggy";
        dog.display();
        dog.eat();
        dog.bark();

        System.out.println();

        Cat cat = new Cat();
        cat.name="kitty";
        cat.display();
        cat.eat();
        cat.meow();
    }
}
/*
Note:
1) Here, two subclasses (Dog and Cat) inherit from a single Superclass (Animal )
2) Inheritance using super and interface keywords will be covered in coming chapters
 */