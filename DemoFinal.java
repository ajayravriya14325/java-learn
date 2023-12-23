//final variables, method and class 
//final variables for creating constant we can't change the value
//final class stop class the inheritance
final class Calc{
  public void show(){
    System.out.println("By Ajay");
  }
  public int add(int a,int b){
    System.out.println(a+b);
  }
}

class AdvCalc extends Calc{

}

public class DemoFinal {
  public static void main(String[] args) {
    AdvCalc obj = new AdvCalc();
    obj.show();
    obj.add(5, 3);
  }
}
