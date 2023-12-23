import others.A;

public class AccessModifyer {
  public static void main(String[] args) {

    A obj = new A();
    System.out.println(obj.marks);
    obj.show();
    Ab obj1 = new Ab();
    System.out.println(obj1.marks);
  }
}
