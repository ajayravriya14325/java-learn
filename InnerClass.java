class A{
  
  int age;

  public void show(){
    System.out.println("In show");
  }
  //static keyword used only for inner class
  static class B{

    public void config(){
      System.out.println("In config");
    }
  }
}


public class InnerClass {
  public static void main(String[] args) {
    
    A obj = new A();
    obj.show();

    //static inner class object creation
    A.B obj1 = new A.B();
    obj1.config();
  }
}
