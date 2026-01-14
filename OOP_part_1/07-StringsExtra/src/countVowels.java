//A program to count the number of vowels in a string
import java.util.Scanner;

class countVowels {
    public static int vowelCount(String str)
    {
        int count = 0;
        str = str.toLowerCase();
        for(int i = 0; i <= str.length()-1; i++)
        {
            char ch = str.charAt(i);

            if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        System.out.println("No of vowels in " + s + " is: " + vowelCount(s));
    }
}
