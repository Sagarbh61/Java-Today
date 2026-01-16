class Shape{
    void draw()
    {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape{
    @Override
    void draw()
    {
        System.out.println("Drawing a circle");
    }
}

public class RuntimePolymorphism_03 {
    public static void main(String[] args)
    {
        Shape s = new Circle();
        s.draw();
    }
}
