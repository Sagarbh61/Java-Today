//A program of sum demonstrating method overloading
class Sum {
    public int add(int a, int b)
    {
        return a+b;
    }
    public int add(int a, int b, int c)
    {
        return a+b+c;
    }
    public static void main(String[] args)
    {
        Sum s = new Sum();
        System.out.println("The sum of two numbers is: "+s.add(2,3));
        System.out.println("The sum of three numbers is: "+s.add(2,3,4));
    }
}
/*
Note:
1)
 */