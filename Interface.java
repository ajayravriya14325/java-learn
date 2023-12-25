//Need of interface

abstract class Computer{

  public abstract void code();
}

class Laptop extends Computer{

  public void code(){
    System.out.println("coding, compile and run");
  }
}

class Desktop extends Computer{

  public void code(){
    System.out.println("coding, compile and run : Faster");
  }
}

class Developer{

  public void devApp(Computer lap){
    lap.code();
  }
}


public class Interface {
  public static void main(String[] args) {
    
    Computer lap = new Laptop();
    Computer desk = new Desktop();

    Developer ajay = new Developer();
    ajay.devApp(lap);
    ajay.devApp(desk);
  }
}
