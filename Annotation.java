class A {

  public void showTheDataWhichBelogsToThisClass(){
    System.out.println("In A show");
  }
}

class B extends A {

  @Override //Annotation
  public void showTheDataWhichBelogsToThisClass(){
    System.out.println("In B show");
  }
}

public class Annotation {

  public static void main(String[] args) {
    
    B obj = new B();
    obj.showTheDataWhichBelogsToThisClass();
  }
}