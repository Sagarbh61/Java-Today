/*
Note:
1) The 'this' keywords refers to the current object
2) It is used to differentiate between instance variables from parameters*/

class ThisKeywordExample {
    int number;

    public ThisKeywordExample(int number)
    {
        this.number = number;
    }
    void displayNumber()
    {
        System.out.println("The number is: "+number);
    }
    public static void main(String[] args)
    {
        ThisKeywordExample obj = new ThisKeywordExample(5);
        obj.displayNumber();
    }
}
