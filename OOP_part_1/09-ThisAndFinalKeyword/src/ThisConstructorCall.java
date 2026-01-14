class ThisConstructorCall {
    ThisConstructorCall()
    {
        this(100);
        System.out.println("Default Constructor");
    }
    ThisConstructorCall(int value)
    {
        System.out.println("Parameterized Constructor: "+value);
    }
    public static void main(String[] args)
    {
        new ThisConstructorCall();
    }
}
