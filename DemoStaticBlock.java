class Mobile{
  //instance var
  String brand;
  int price;
  //static var
  static String name; 
  // static block is called only one time if you created one or more then one object
  //if object is not created for class then static block not called
  static{
    name = "Phone";
    System.out.println("Static block");
  }
  //Constractor method called when every new object is created
  public Mobile(){
    brand = "";
    price = 10000;
    //name = "Phone";
    System.out.println("Constractor method");
  }

  public void show(){
    System.out.println(brand + " : " + price + " : " + name);
  }
}

public class DemoStaticBlock {
  
  public static void main(String a[]) throws ClassNotFoundException{
    //Now static block is called
    Class.forName("Mobile");
  }
}
