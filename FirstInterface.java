interface A {

  int age = 25; // var are final and static can't redefine
  String area = "Indore";

  void show();
  void config();
}

class B implements A{

  public void show(){
    System.out.println("in show");
  }

  public void config(){
    System.out.println("in config");
  }

}


public class FirstInterface {
  public static void main(String[] args) {
    A obj;

    obj = new B();
    obj.show();
    obj.config();

    System.out.println("Age : "+A.age+ " Area : "+A.area);
  }
}
