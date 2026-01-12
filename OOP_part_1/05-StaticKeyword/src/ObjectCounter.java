//A program on counting the number of objects using the static keyword
class ObjectCounter{
    static int count = 0;
    ObjectCounter()
    {
        count++;
    }
    static void displayCount()
    {
        System.out.println("Total objects created: "+count);
    }
    public static void main(String[] args)
    {
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();
        ObjectCounter obj4 = new ObjectCounter();
        ObjectCounter.displayCount();
    }
}
/*
Note:
1) Static variables are shared across all objects of the class.
2) The constructor increments the static 'count' variable each time
   an object is created.
3) Static methods can access static variables directly.
*/
