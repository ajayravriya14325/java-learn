class Calculator {
  //method name same but parameter is diffrent
  public int add(int n1,int n2) {
    return n1 + n2;
  }

  public int add(int n1,int n2,int n3) {
    return n1 + n2 + n3;
  }

  public double add(double n1,int n2) {
    return n1 + n2;
  }
  
}

public class Overloading {
  public static void main(String args[]){
    
    Calculator calc = new Calculator();

    int result = calc.add(3,4);
    int result1 = calc.add(5, 23, 50);
    double result3 = calc.add(300000000,4);

    System.out.println(result);
    System.out.println(result1);
    System.out.println(result3);


  }
}
