//Factorial program using method
class FactorialMethod {
    public static int factorial(int n)
    {
        int fact = 1;

        for(int i = 1; i <= n; i++)
        {
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args)
    {
        int num = 6;
        System.out.println("The factorial of "+num+" is: "+factorial(num));
    }
}
/*
Note:
1) A loop runs inside the factorial() method from 1 up to the number provided by the user.
2) Inside the loop, the factorial is calculated by multiplying the current index with
   the variable 'fact' and updating it at each iteration.
3) Once the loop finishes, the method returns the final 'fact' value.

----- To be updated using recursion in the next section -----
*/
