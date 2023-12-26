
//enum like a class under that its object
enum Status{
  Running, Failed, Pending, Success;
}

public class Enum {
  public static void main(String[] args) {
    
    //accessing enum class object
    Status s = Status.Running;

    if(s == Status.Running){
      System.out.println("All Good");
    }else if (s == Status.Failed) {
      System.out.println("Try again");
    }else if(s == Status.Pending){
      System.out.println("Please wait");
    }else{
      System.out.println("Done");
    }
  }
}
