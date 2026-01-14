class ParentMethod {
    final void show()
    {
        System.out.println("This is a parent method");
    }
}
class ChildMethod extends ParentMethod{
  //  void show(){} --> cannot be overridden

    public static void main(String[] args)
    {
      ChildMethod obj = new ChildMethod();
      obj.show();
    }
}
