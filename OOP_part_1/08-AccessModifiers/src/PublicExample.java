class PublicExample {
    public String message = "I am public";

    public void showMessage()
    {
        System.out.println(message);
    }
    public static void main(String[] args)
    {
        PublicExample obj = new PublicExample();
        obj.showMessage();
    }
}
/*
Note:
1) Public members are accessible from any other class or package.
 */