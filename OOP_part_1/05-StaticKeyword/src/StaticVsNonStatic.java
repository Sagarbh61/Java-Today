public class StaticVsNonStatic {
    int x = 10;
    static int y =15;

    void showNonStatic()
    {
        System.out.println("x = "+x);
    }
    static void showStatic()
    {
        System.out.println("y = "+y);
    }
    public static void main(String[] args)
    {
        StaticVsNonStatic obj  = new StaticVsNonStatic();
        obj.showNonStatic();
        StaticVsNonStatic.showStatic();
    }
}
/*
Note:
1) Non-static members belong to objects.
2) Static members belong to the class.
3) Static methods cannot directly access non-static variables.
*/

