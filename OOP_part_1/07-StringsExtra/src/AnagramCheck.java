//A program to check if two words are anagrams of each other

import java.util.Scanner;

class AnagramCheck {
    public static boolean checkAnagram(String s1, String s2) {
        s1 = s1.toLowerCase().replaceAll("\\s+", "");
        s2 = s2.toLowerCase().replaceAll("\\s+", "");

        if(s1.length() != s2.length())
        {
            return false;
    }
        for(int i = 0; i < s1.length(); i++)
        {
            char ch = s1.charAt(i);

            int index = s2.indexOf(ch);
            if(index == -1)
            {
                return false;
            }
            s2 = s2.substring(0, index) + s2.substring(index+1);
        }
        return s2.isEmpty();
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if (checkAnagram(str1, str2))
        {
            System.out.println("The two strings are anagrams");
        }
        else
            System.out.println("The two strings are not anagrams");
    }
}
/*
NOTE:
1) This is a simple anagram check using basic String operations.
2) Each matched character is removed from the second string.

*/
