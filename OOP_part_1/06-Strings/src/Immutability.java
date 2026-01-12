//A program demonstrating the immutability of strings

class Immutability{
    public static void main(String[] args)
    {
        String name = "Java";
        String newName = name.concat(" Today");
        System.out.println(name);
        System.out.println(newName);
    }
}
/*
Note:
1. Strings are immutable
2. concat() creates a new string, it does not modify the original.
3. If the result is not reassigned, original string remains unchanged.
*/