// Multiple inheritance can be achieved using interfaces by implementing multiple interfaces

interface Printable{
    void print();
}

interface Scannable{
    void scan();
}

class Printer implements Printable, Scannable{
    @Override
    public void print()
    {
        System.out.println("Printing Document");
    }

    @Override
    public void scan() {
        System.out.println("Scanning Document");
    }
}

public class InterfaceEx2 {
    public static void main(String[] args)
    {
        Printer p = new Printer();
        p.print();
        p.scan();
    }
}

