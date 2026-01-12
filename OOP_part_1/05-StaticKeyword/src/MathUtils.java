class MathUtils {
    static int square(int n)
    {
        return n*n;
    }
    static int cube(int n)
    {
        return n*n*n;
    }
    public static void main(String[] args)
    {
        int n = 4;
        System.out.println("The square of "+n+" is: "+MathUtils.square(n));
        System.out.println("The cube of "+n+" is: "+MathUtils.cube(n));
    }
}
/*
Note:
1) Static methods can be called using the class name.
2) No object is created to access square() or cube().
3) Such classes are often used as utility/helper classes.
*/