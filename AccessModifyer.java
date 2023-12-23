import others.A;

//protected var can't access outside the package 
//but we can access protected var outside the package but it should be accessed in subclass or child class 
class C extends A{
  public void abc(){
    System.out.println(marks);
  }
}
public class AccessModifyer {
  public static void main(String[] args) {

    A obj = new A();
    System.out.println(obj.marks);
    obj.show();
    Ab obj1 = new Ab();
    System.out.println(obj1.marks);
  }
}
