class StringComparison {
    public static void main(String[] args)
    {
        String a ="Java";
        String b = "Java";
        String c = new String("Java Today");

        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(a.equals(c));
    }
}
/*
Note:
1. '=='compares memory references.
2. equals() compares actual content.
3. Always use equals() for string comparison.
 */