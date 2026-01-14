//A program to count the number of words in a sentence
import java.util.Scanner;

class CountWords {
    public static int countWord(String str)
    {
        str = str.toLowerCase();
        String[] words = str.trim().split("\\s+");
        int count = 0;
        for(int i = 0; i <= words.length-1; i++)
        {
            count++;
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = sc.nextLine();
        System.out.println("The no of words in the sentence is: "+countWord(s));
    }
}
