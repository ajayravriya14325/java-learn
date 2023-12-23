//final variables, method and class 
//final variables for creating constant we can't change the value
//final class stop class the inheritance
//final method stop overriding methods like show()
class Calc{
  public final void show(){
    System.out.println("By Ajay");
  }
  public void add(int a,int b){
    System.out.println(a+b);
  }
}

class AdvCalc extends Calc{
  public void show(){
    System.out.println("By John");
  }
}

public class DemoFinal {
  public static void main(String[] args) {
    AdvCalc obj = new AdvCalc();
    obj.show();
    obj.add(5, 3);
  }
}
