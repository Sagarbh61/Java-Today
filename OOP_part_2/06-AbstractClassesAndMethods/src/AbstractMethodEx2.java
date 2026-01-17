abstract class shape{
    abstract void draw();
    abstract double area();
}

class Rectangle extends shape{
    int length = 10;
    int breadth = 20;

    @Override
    void draw() //implementation of abstract method
    {
        System.out.println("Drawing a rectangle");
    }
    double area() //implementation of abstract method
    {
        return length*breadth;
    }
}
class AbstractMethodEx2 {
    public static void main(String[] args)
    {
     Rectangle r = new Rectangle();
     r.draw();
     System.out.println("The area of rectangle is "+r.area());
    }
}
/*
Key points:
- A subclass must implement all abstract methods, otherwise it must be abstract too
*/