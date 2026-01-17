interface Animal{
    void sound();
}

class Dog implements Animal{
    @Override
    public void sound()
    {
        System.out.println("Dog barks");
    }
}


public class InterfaceEx1 {
    public static void main(String[] args)
    {
     Dog dog = new Dog();
     dog.sound();
    }
}
/*
Key points:
1) Interface methods are public and abstract by default
2) Achieved by using 'implements' keyword
 */