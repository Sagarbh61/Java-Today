class Animal{
    String name;

    void eat()
    {
        System.out.println("I can eat");
    }
}

class Dog extends Animal{
    void display()
    {
        System.out.println("My name is "+name);
    }
    void bark()
    {
        System.out.println("I can bark");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
            Dog labrador = new Dog();
            labrador.name = "puppy"; //Accessing variable of the superclass using an object of the subclass
            labrador.display(); //Inherits the field 'name' of its superclass
            labrador.eat(); //Inherits the method of the superclass
            labrador.bark(); // Subclass's own method
        }
    }
/*
Note:
1) This is also an example of single inheritance (a subclass inherits from a superclass)
*/