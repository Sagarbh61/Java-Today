class IsPrime {
    public static boolean checkPrime(int n)
    {
        if(n <= 1)
        {
            System.out.println("Less than 2 is not prime");
            return false;
        }
        for(int i = 2; i < n; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        int num = 5;
        if(checkPrime(num))
        {
            System.out.println(num+" is a prime number");
        }
        else
            System.out.println(num+" is not a prime number");
    }
}
/*
Note:
1) A prime number is divisible only by 1 and itself.
2) Numbers less than or equal to 1 are not considered prime.
3) To check for primality, the loop starts from 2 and runs up to n - 1
   (or can be optimized to run up to √n).
4) If the number is divisible by any value in this range, it is not prime;
   otherwise, it is prime.
*/

