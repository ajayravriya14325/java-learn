/**
 *  A
 */
class  A {
  public void show1(){
    System.out.println("in A show");
  }
}

class B extends A{
  public void show2(){
    System.out.println("in B show");
  }
}

public class UpCosting {

  public static void main(String[] args) {

    // A obj = (A) new B(); // in up casting we don't need to put casting class like (A)
     A obj = new B();
     obj.show1();
  }
}