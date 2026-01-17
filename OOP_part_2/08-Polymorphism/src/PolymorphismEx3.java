//Polymorphism using abstract class and method

abstract class Employee{
    abstract void work();
}

class Developer extends Employee{
    @Override
    void work()
    {
        System.out.println("Developer writes code");
    }
}

class Tester extends Employee{
    @Override
    void work() {
        System.out.println("Tester tests code");
    }
}

public class PolymorphismEx3 {
    public static void main(String[] args)
    {
     Employee e1 = new Developer();
     Employee e2 = new Tester();

     e1.work();
     e2.work();
    }
}
/*
Abstract method defines 'what' whereas child methods define 'how'.
 */