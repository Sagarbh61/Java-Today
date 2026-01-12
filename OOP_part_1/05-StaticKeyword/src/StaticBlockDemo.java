class StaticBlockDemo{
    static int value;

    static{
        value = 10;
        System.out.println("Static block is executed");
    }
    public static void main(String[] args)
    {
        System.out.println("Value: "+value);
    }
}
/*
Note:
1) Static block executes once when the class is loaded.
2) It runs before the main() method.
3) Used for initializing static variables.
*/
