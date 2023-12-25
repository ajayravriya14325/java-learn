
interface Computer{

  void code();
}

class Laptop implements Computer{

  public void code(){
    System.out.println("coding, compile and run");
  }
}

class Desktop implements Computer{

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
