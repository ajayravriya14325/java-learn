class A{

  public void show(){
    System.out.println("in A show");
  }
}

class B extends A{

  public void show(){
    System.out.println("in B show");
  }
}

public class AnonynomusInnerClass {
  public static void main(String[] args) {
    //its a inner class becoz..its under AnonynomusInnerClass class
    //And not having any name for class so it is called Anonynomus Inner Class
    A obj = new A(){
      public void show(){
        System.out.println("in anonynomus Inner Class show");
      }
    };
    obj.show();
  }
}
