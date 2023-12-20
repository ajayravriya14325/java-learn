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
  
  public static void main(String a[]){
    Mobile m1 = new Mobile();
    m1.brand = "Apple";
    m1.price = 80000;
    // static var should be called via class name not object name
    Mobile.name = "SmartPhone";

    Mobile m2 = new Mobile();

    Mobile m3 = new Mobile();
    m3.brand = "One plus";
    m3.price = 30000;
    Mobile.name = "SmartPhone";

  }
}
