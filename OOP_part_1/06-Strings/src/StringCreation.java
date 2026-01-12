//Methods to create strings
class StringCreation {
    public static void main(String[] args)
    {
        String s1 = "Java";
        String s2 = new String("Java-Today");
        System.out.println("String 1: "+s1);
        System.out.println("String 2: "+s2);
    }
}
/*
Note:
1. Strings can be created using literals or the new keyword.
2. String literals are stored in String Constant pools.
3. new String() always creates a new object in the heap memory.
*/