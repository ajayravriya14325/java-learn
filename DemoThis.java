
class A{
  public A(){
    super();
    System.out.println("In A");
  }

  public A(int x){
    super();
    System.out.println("In A parameter X");
  }
}

class B extends A{
  public B(){
    super();
    System.out.println("In B");
  }

  public B(int N){
    this(); //this() method is calling same class default constructor
    System.out.println("In B parameter N");
  }
}

public class DemoThis {
  
  public static void main(String a[]){
    B obj = new B(1);
  }
}
