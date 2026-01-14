import java.util.Scanner;
class Factorial {
    public static int fact(int n)
    {
        while( n != 0)
        {
            return n * fact(n-1);
        }
        return 1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num  = sc.nextInt();
        System.out.println("The factorial of "+num+" is: "+fact(num));
    }
}
