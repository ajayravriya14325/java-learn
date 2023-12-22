class Calc{

  public int add(int n1,int n2){
    return n1+n2;
  }
}

class AdvCalc extends Calc{
  //below add() method over riding the parent add() method
  public int add(int n1,int n2){
    return n1+n2+5;
  }
}

public class Overriding {
  public static void main(String[] args) {
    
    AdvCalc obj = new AdvCalc();
    int result = obj.add(4, 6);

    System.out.println(result);
  }
}
