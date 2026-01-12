//A program in constructor overloading making use of default (non-parameterized) and parameterize
//constructors

class ConstructorOverloading{
    int x, y;
    ConstructorOverloading()
    {
        x = 0;
        y = 0;
    }
    ConstructorOverloading(int a)
    {
        x = a;
        y = 0;
    }
    ConstructorOverloading(int a, int b)
    {
        x = a;
        y = b;
    }
    void display()
    {
        System.out.println("x = "+ x +",  y = "+ y);
    }
    public static void main(String[] args)
    {
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading(20);
        ConstructorOverloading obj3 = new ConstructorOverloading(20, 30);

        obj1.display();
        obj2.display();
        obj3.display();
    }
}
/*
Note:
1) Here, three constructors with different parameters are created. This is called constructor
overloading.
2) Upon object creation, suitable constructors are called according to arguments passed into them.
 */

