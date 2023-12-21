
//Every class in java by defualt having parent class object mean class A extends Object
class A{
  public A(){
    super(); //Every constructor having super() method default
    System.out.println("In A");
  }

  public A(int x){
    super();
    System.out.println("In A parameter X");
  }
}

class B extends A{
  public B(){
    //super() = calling parent class default constructor
    //super(5) = calling parent class parameterised constructor
    super();
    System.out.println("In B");
  }

  public B(int N){
    super(N); // if passing parameter then it's calling parent class parameterised constructor
    System.out.println("In B parameter N");
  }
}

public class DemoSuper {
  
  public static void main(String a[]){
    B obj = new B(1);
    B obj2 = new B();
  }
}
