
//enum like a class under that its object
enum Status{
  Running, Failed, Pending, Success;
}

public class Enum {
  public static void main(String[] args) {
    
    //accessing enum class object
    Status s = Status.Success;

    System.out.println(s);
  }
}
