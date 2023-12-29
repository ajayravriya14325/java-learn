
//class A implements Runnable {
//  public void run(){
//    for(int i = 0; i < 5; i++){
//      System.out.println("Hi");
//      try {
//        Thread.sleep(10);
//      } catch (InterruptedException e) {
//        // TODO Auto-generated catch block
//        e.printStackTrace();
//      }
//    }
//  }
//}

////in thread method name is run always 
//class B implements Runnable {
//  public void run(){
//    for(int i = 0; i < 5; i++){
//      System.out.println("Hello");
//      try {
//        Thread.sleep(10);
//      } catch (InterruptedException e) {
//        // TODO Auto-generated catch block
//        e.printStackTrace();
//      }
//    }
//  }
//}

public class RunnableWithThread {
  public static void main(String[] args) {
    
    Runnable obj1 = () ->
    {
      for(int i = 0; i < 5; i++){
        System.out.println("Hi");
        try {
          Thread.sleep(10);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    };
    Runnable obj2 = () ->
    {
      for(int i = 0; i < 5; i++){
        System.out.println("Hello");
        try {
          Thread.sleep(10);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    };

    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);

    t1.start(); //thread method called via start()
    t2.start();
  }
}


