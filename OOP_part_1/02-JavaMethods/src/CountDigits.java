class CountDigits {
    public static int count(int n)
    {
        int digit = 0;

        while(n != 0)
        {
            digit++;
            n /= 10;
        }
        return digit;
    }
    public static void main(String[] args)
    {
        int n = 5482;
        System.out.println("The no of digits is: "+count(n));
    }
}
/*
Note:
1) To count the digits, a while loop runs until the number is zero.
2) At each loop, the digit count is increased by 1.
3) The number is sliced by 10 and updated
4) The latest digit count is returned once the loop ends.
 */

