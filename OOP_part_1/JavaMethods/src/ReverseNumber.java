class ReverseNumber{
    public static int reverse(int n)
    {
        int rev = 0;

        while( n!= 0)
        {
            rev = rev * 10+ n % 10;
            n /= 10;
        }
        return rev;
    }
    public static void main(String[] args)
    {
        int n = 245;
        System.out.println("The reverse of "+n+" is: "+reverse(n));
    }
}
/*
Note:
1) The remainder of the input number is obtained using the modulo operator (%)
   and added to the product of (rev * 10), updating the value of 'rev'.
2) The input number is then reduced by dividing it by 10, effectively removing
   the last digit.
3) This process repeats until the input number becomes 0, at which point the loop exits.
4) Finally, the method returns the updated value of 'rev', which represents the reversed number.
*/

