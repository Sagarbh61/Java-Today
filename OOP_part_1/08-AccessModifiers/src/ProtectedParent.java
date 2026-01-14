/*
protected members are accessible within the same package
and in subclasses.
*/

class ProtectedParent {
    protected String message = "This is protected";
}

class ProtectedChild extends ProtectedParent{
    void showMessage()
    {
        System.out.println(message);
    }
    public static void main(String[] args)
    {
        ProtectedChild obj = new ProtectedChild();
        obj.showMessage();
    }
}

/*
Note: The concept of 'extends' keyword and inheritance will be covered in OOP part II.
 */