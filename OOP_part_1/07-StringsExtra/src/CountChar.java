//A program to count the number of letters in a sentence

import java.util.Scanner;

class CountChar {
    public static int countWord(String str) {
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
        public static int countLetters(String str)
        {
            int letterCount = 0;
            String[] words = str.trim().split("\\s+");
            for( String w:words)
            {
                letterCount+=w.length();
            }
            return letterCount;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = sc.nextLine();
        System.out.println("The number of words is: "+countWord(s));
        System.out.println("The number of letters is: "+countLetters(s));
    }
}
