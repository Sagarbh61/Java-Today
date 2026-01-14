//Default methods are accessible only within the same package
//The default access modifier is used when no access modifier keyword is specified

class DefaultExample {
    String message = "This is default";

    void showMessage()
    {
        System.out.println(message);
    }
    public static void main(String[] args)
    {
        DefaultExample obj = new DefaultExample();
        obj.showMessage();
    }
}
