import java.util.Scanner;

class SumOfDigits {
    public static int sumOfDigits(int n) {
        if (n == 0)
            return 0;
        return (n % 10)+ sumOfDigits(n/10);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("The sum of digits of "+num+" is: "+sumOfDigits(num));
    }
}
