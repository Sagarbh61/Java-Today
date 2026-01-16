class Puppy extends Dog{
    void play()
    {
        System.out.println("Puppy plays");
    }
}

public class MultiLevel {
    public static void main(String[] args)
    {
        Puppy pup = new Puppy();
        pup.name="babyPup";
        pup.display();
        pup.eat();
        pup.bark();
        pup.play();
    }
}
/*
Note:
1) Here, a subclass inherits from a superclass and the subclass further acts as a superclass from which
another subclass is inherited.
*/