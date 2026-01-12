class Area {
    //Methods to find area
    public int area(int length)
    {
        return length * length;
    }
    public int area(int length, int breadth)
    {
        return length * breadth;
    }
    public double area(double radius)
    {
        return 3.14 * radius * radius;
    }
    public static void main(String[] args)
    {
        Area a = new Area();
        System.out.println("The area of square is: "+a.area(5));
        System.out.println("The area of rectangle is: "+a.area(5,6));
        System.out.println("The area of circle is: "+a.area(3.5));
    }
}
/*
Note:
1) Overloaded methods share the same method name but have different parameters.
2)Demonstrates area() methods for square, rectangle, and circle.
 */