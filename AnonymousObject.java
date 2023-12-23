class A{
  public char[] marks;

  public A(){
    System.out.println("Object is created");
  }

  public void show(){
    System.out.println("In A show");
  }
}

public class AnonymousObject {
  public static void main(String a[]){
    new A(); // this is Anonymous Object becoz don't have name
    new A().show();
  }
}