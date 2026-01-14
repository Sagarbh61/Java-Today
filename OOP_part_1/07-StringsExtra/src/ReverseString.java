//A program to reverse string
import java.util.Scanner;

class ReverseString {
    public String reverse(String s)
    {
        String str = "";
        for(int i = s.length()-1; i >= 0; i--)
        {
            str += s.charAt(i);
    }
        return str;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = sc.nextLine();
        System.out.println("The original string is: "+input);
        ReverseString rs = new ReverseString();
        System.out.println("The reversed string is: "+rs.reverse(input));
    }
}
