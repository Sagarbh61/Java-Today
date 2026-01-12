//Some common String Methods
class StringMethods {
    public static void main(String[] args)
    {
        String str = " Java Today ";

        System.out.println("Length: "+str.length());
        System.out.println("Uppercase: "+str.toUpperCase());
        System.out.println("Lowercase: "+str.toLowerCase());
        System.out.println("Trimmed: '"+str.trim()+"'");
        System.out.println("Substring: "+str.substring(3,8));
    }
}
/*
Note:
1. length() returns the number of characters.
2. trim() removes trailing and leading spaces.
3. substring (start, end) extracts parts of a string.
4. Original String remains unchanged.
 */