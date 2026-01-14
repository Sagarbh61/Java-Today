// Final values cannot be reassigned once initialized

class FinalVariableExample {
    final int MAX = 100;

    public static void main(String[] args)
    {
        FinalVariableExample obj = new FinalVariableExample();
        System.out.println("MAX value: "+obj.MAX);
        // obj.MAX = 200; --> Not allowed
    }
}
