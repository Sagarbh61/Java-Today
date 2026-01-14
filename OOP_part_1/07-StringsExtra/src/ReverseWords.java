//A program to reverse words in a sentence
import java.util.Scanner;

class ReverseWords {
    public static String reverse(String s)
    {
        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for(int i = words.length-1; i >=0; i--)
        {
            result.append(words[i]);
            if(i != 0)
            {
                result.append(" ");
            }
        }
        return result.toString();
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String input = sc.nextLine();
        System.out.println("The reversed sentence is: "+reverse(input));
    }
}
