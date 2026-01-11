//We can also perform operations on the objects of the class
class Rectangle {
    int length;
    int breadth;
    public int area()
    {
        return length*breadth;
    }
    public int perimeter()
    {
        return 2*(length+breadth);
    }
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle();
        r.length = 5;
        r.breadth = 10;

        int a = r.area();
        int p = r.perimeter();

        System.out.println("The area is: "+a+"\nThe perimeter is: "+p);
    }
}
/*
Note:
1) Values of the class variables (length and breadth) are assigned using
the dot operator on the object.
2) Methods specify a particular operation to be performed.
3) The area() method calculates and returns the area of the rectangle.
4) The perimeter() method calculates and returns the perimeter of the rectangle.
5) These returned values are used in the main method, e.g., for printing or further calculations.
*/
