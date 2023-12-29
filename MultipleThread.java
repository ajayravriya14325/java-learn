class A extends Thread {
  public void run(){
    for(int i = 0; i < 100; i++){
      System.out.println("Hi");
    }
  }
}

//in thread method name is run always 
class B extends Thread {
  public void run(){
    for(int i = 0; i < 100; i++){
      System.out.println("Hello");
    }
  }
}

public class MultipleThread {
  public static void main(String[] args) {
    
    A obj1 = new A();
    B obj2 = new B();

    System.out.println(obj1.getPriority());

    obj2.setPriority(3);

    obj1.setPriority(Thread.MAX_PRIORITY);

    obj1.start(); //thread method called via start()
    obj2.start();
  }
}
