class Max{
    public int max(int a, int b)
    {
        return (a > b) ? a:b;
    }
    public int max(int a, int b, int c)
    {
        return max(max(a,b), c);
    }
    public static void main(String[] args)
    {
        Max m = new Max();
        System.out.println("The maximum of two numbers is: "+m.max(5,7));
        System.out.println("The maximum of three numbers is: "+m.max(5,7,10));
    }
}
/*
Note:
1)Method overloading to find the maximum of two or three numbers.
 */