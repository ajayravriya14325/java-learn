class A {
  public void show(){
    System.out.println("In A show");
  }
}

class B extends A{
  public void show(){
    System.out.println("In B show");
  }
}

class C extends B{
  public void show(){
    System.out.println("In C show");
  }
}


public class DynamicMethod {
  public static void main(String[] args) {
    //Run time ploymorphism / Dynamic method dispatch
    A obj = new A();
    obj.show();

    obj = new B();
    obj.show();

    obj = new C();
    obj.show();
  }
}
