class StringBuilderVsString {
    public static void main(String[] args)
    {
        String str = "Hello";
        str.concat(" World");

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");

        System.out.println("String :"+str);
        System.out.println("String Builder: "+sb);
    }
}
/*
Note:
1. String is immutable but StringBuilder is mutable.
2. StringBuilder is more efficient for frequent modifications.
*/