public class User {
    private final String name;
    private final int pin;

    public User(String name, int pin) {
        this.name=name;
        this.pin=pin;
    }

    public String getName()
    {
        return name;
    }
    public boolean verifyPin(int inputPin)
    {
        return pin == inputPin;
    }
}