
//enum like a class under that its object
enum Status{
  Running, Failed, Pending, Success;
}

public class Enum {
  public static void main(String[] args) {
    
    //accessing enum class object
    Status s = Status.Running;

    switch (s) {
      case Running:
        System.out.println("All Good");
        break;
      case Failed:
        System.out.println("Try again");
        break;
      case Pending:
        System.out.println("Please wait");
        break;
      default:
        System.out.println("Done");
        break;
    }
  }
}
