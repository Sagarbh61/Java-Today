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

public class AbstractMethodEx4 {
    public static void main(String[] args)
    {
        Employee e = new Developer();
        e.work();
    }
}
/*
Abstract classes cannot be instantiated but reference is allowed
 */