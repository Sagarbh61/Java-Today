/*
1) Private methods are accessible only within the same class and not outside them.
2) If you try accessing it from outside the PrivateExample class, it will cause errors.
*/

class PrivateExample {
    private String message = "I am private";

    private void showMessage()
    {
        System.out.println(message);
    }
    public static void main(String[] args)
    {
        PrivateExample obj = new PrivateExample();

        obj.showMessage(); // It is only accessible here because it is within the same class
        // System.out.println(obj.showMessage()); --> this will cause error if uncommented
    }
}
