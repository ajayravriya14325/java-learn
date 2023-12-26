
//@FunctionalInterface
interface A{
  void show(int i);
}

public class LamdaExpression {
  public static void main(String[] args) {

    A obj = (i) -> { //Lamda Expression
        System.out.println("in Show"+ i);
      };
    obj.show(5);
  }
}
