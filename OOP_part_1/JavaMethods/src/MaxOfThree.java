//To find the largest number among three numbers
class MaxOfThree{
    static int max(int a, int b, int c)
    {
        int largest = a;

        if(b > largest)
            largest = b;
        if(c > largest)
            largest = c;
        return largest;
    }
    public static void main(String[] args)
    {
        int a = 10, b = 20, c =5;
        System.out.println("The largest among "+a+" "+b+" "+c+" "+" is: "+max(a,b,c));
    }
}
/*
Note:
1) The max() method checks the condition to find the largest number.
2) First, 'a' is assumed to be the largest value.
3) Then, 'b' and 'c' are compared with the current largest value and updated if needed.
4) Finally, the method returns the largest value.
*/
