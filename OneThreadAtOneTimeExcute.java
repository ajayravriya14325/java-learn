
class Counter  {
  int count;
  //use of sychronized one thread excute at one time
  public synchronized void increment(){
    count++;
  }
}
public class OneThreadAtOneTimeExcute {
  public static void main(String[] args) throws InterruptedException {
    Counter c = new Counter();

    Runnable obj1 = () ->
    {
      for(int i = 0; i < 1000; i++){
        c.increment();
      }
    };
    Runnable obj2 = () ->
    {
      for(int i = 0; i < 1000; i++){
        c.increment();
      }
    };

    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);

    t1.start(); //thread method called via start()
    t2.start();

    t1.join(); // join() = main method wait for the threads complition
    t2.join();

    System.out.println("Correct" + c.count);
  }
}


