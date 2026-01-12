class DefaultConstructor{
    public DefaultConstructor()
    {
        System.out.println("Default Constructor called");
    }
    public static void main(String[] args)
    {
        DefaultConstructor obj = new DefaultConstructor();
    }
}
/*
Note:
1) A default constructor is called automatically during object creation.
2) If no constructor is explicitly defined in a class, Java provides a default
 no-argument constructor.
*/
