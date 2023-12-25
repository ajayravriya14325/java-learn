interface A {

  int age = 25; // var are final and static can't redefine
  String area = "Indore";

  void show();
  void config();
}

interface X{

  void run();
}

interface Y extends X {

}

class B implements A,Y{

  public void show(){
    System.out.println("in show");
  }

  public void config(){
    System.out.println("in config");
  }

  public void run(){
    System.out.println("Running");
  }

}


public class FirstInterface {
  public static void main(String[] args) {
    A obj;
    obj = new B();

    obj.show();
    obj.config();

    X obj1 = new B();
    obj1.run();

    System.out.println("Age : "+A.age+ " Area : "+A.area);
  }
}
