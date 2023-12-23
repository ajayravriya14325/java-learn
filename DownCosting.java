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

public class DownCosting {

  public static void main(String[] args) {

    // A obj = (A) new B(); // in up casting we don't need to put casting class like (A)
    //when we convert object of child class to object of parent class is called up costing
     A obj = new B();
     obj.show1();
    //when we convert object of parent class to object of child class is called down costing
     B obj1 = (B) obj; // 
     obj1.show2();
  }
}