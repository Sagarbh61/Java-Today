// A program to check if the string is palindrome
import java.util.Scanner;

class Palindrome {
    public void checkPalindrome(String str) {

        String original = str.toLowerCase();
        String reversed = new StringBuilder(original).reverse().toString();

        if (original.equals(reversed)) {
            System.out.println("The string is palindrome");
        } else
            System.out.println("The string is not palindrome");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = sc.nextLine();
        Palindrome p = new Palindrome();
        p.checkPalindrome(input);
    }
}

