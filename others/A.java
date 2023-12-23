package others;

class Lunch{
  public void abc(){
    A obj = new A();
    System.out.println(obj.marks);
  }
}
public class A {
  //protected var access in same package. Can't even use outside the package
  protected int marks = 50;

  public void show(){
    System.out.println("in A show method");
  }
}
