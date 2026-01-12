//A fundamental problem in learning java methods with introduction to static method
class SumAndAverage {
    public static int sum(int a, int b)
    {
        return a+b;
    }
    public static float average(float a, float b)
    {
        return (a+b)/2;
    }
    public static void main(String[] args)
    {
        int s = sum(15,10);
        float a= average(20,10);
        System.out.println("The sum is: "+s+"\nThe average is: "+a);
    }
}
/*
Note:
1) The 'static' keyword allows us to access the methods of the class
without creating an object. Notice that in the main method, no object
has been created and the methods are accessed directly.
2) '\n' is an escape character that moves the output cursor to
the next line.
*/
