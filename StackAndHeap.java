class Calculator {
  
  int num = 20;

  public int add(int n1,int n2) {
    return n1 + n2;
  }
  
}

public class StackAndHeap {
  public static void main(String args[]){
    
    Calculator obj = new Calculator();
    Calculator obj1 = new Calculator();
    int result = obj.add(3,4);
    obj1.num = 50;
    System.out.println(result);
    System.out.println(obj.num);
    System.out.println(obj1.num);


  }
}
