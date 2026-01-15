public class Main {
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.setName("Sagar");
        s1.setAge(21);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        Book b1 = new Book("The Stranger");
        System.out.println(b1.getBookName());
        Password p1 = new Password();
        p1.setPassword(1234);
    }
}
