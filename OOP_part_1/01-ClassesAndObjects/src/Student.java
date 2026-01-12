//A fundamental Java program on classes and objects concepts using Student

public class Student {
    String name;
    int roll_no;
    double marks;

    void display()
    {
        System.out.println("Name: "+name+"\nRoll no: "+roll_no+"\nMarks: "+marks);
    }
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.name="Sagar Bhattarai";
        s1.roll_no = 49;
        s1.marks = 88.5;
        Student s2 = new Student();
        s2.name = "Sandesh Sharma";
        s2.roll_no = 51;
        s2.marks = 86;
        s1.display();
        System.out.println();
        s2.display();
    }
}
/* Note:
1) An object is created using the 'new' keyword.
2) Each object of the class Student has its own copy of variables
 i.e., s1.name is separate from s2.name, s1.roll_no is separate from s2.roll_no, etc.
3) Methods are functions that carry out a particular logic for a problem.
4) We can access members (variables and methods) of the class using the dot (.)
 operator preceded by the object name.
*/
