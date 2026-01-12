class ParameterizedConstructor{
    int age;
    ParameterizedConstructor(int a)
    {
        age = a;
    }
    void display()
    {
        System.out.println("The age is: "+age);
    }
    public static void main(String[] args)
    {
        ParameterizedConstructor obj = new ParameterizedConstructor(21);
        obj.display();
    }

}
