/*
Note:

The super keyword is used to access superclass members

Uses of super keyword:
1) A use of super keyword is to call overridden methods in a program
2) Another use is to access the attributes of the superclass
3) It can also be used to call the constructors of superclass
*/
class Animal{
    protected String type = "Animal";

    Animal()
    {
        System.out.println("This is an animal constructor");
    }
    Animal(String name)
    {
        System.out.println("Parameterized constructor of "+name+" superclass");
    }
    public void display() //overridden method
    {
        System.out.println("I am an animal");
    }
}

class Dog extends Animal{
    public String type = "mammal";

    Dog()
    {
        super("Animal");
        System.out.println("This is a dog constructor");
    }
    @Override //Overriding method
    public void display()
    {
        super.display();
        System.out.println("I am a dog");
    }
    public void printType()
    {
        System.out.println("Type: "+type);
        System.out.println("Type: "+super.type);
    }
}
public class SuperExample1{
    public static void main(String[] args) {
            Dog dog = new Dog();
            dog.display(); // Accessing both overridden and overriding methods
            dog.printType(); //Accessing attribute of the superclass
        }
    }
