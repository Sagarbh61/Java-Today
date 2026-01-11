//A program that keeps track of the number of objects created
class ObjectCounter {
    public ObjectCounter()
    {
        System.out.println("Object created");
    }
    public static void main(String[] args) {
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();
    }
}
/*
Note:
1) This program demonstrates object creation and prints a message
each time an object is created.
2) It does not keep a count of the total number of objects created.
3) In the next chapter, we will update this program using
the 'static' keyword to maintain a shared count across all objects.
*/
