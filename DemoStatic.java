class Mobile{
  String brand;
  int price;
  //Static var change the all object value and static var value share with all object
  //Static var is a class member not a object member
  static String name; 

  public void show(){
    System.out.println(brand + " : " + price + " : " + name);
  }
}

public class DemoStatic {
  public static void main(String a[]){
    Mobile m1 = new Mobile();
    m1.brand = "Apple";
    m1.price = 80000;
    Mobile.name = "SmartPhone"; // static var should be called via class name not object name

    Mobile m2 = new Mobile();
    m2.brand = "Realme";
    m2.price = 15000;
    Mobile.name = "SmartPhone";

    Mobile m3 = new Mobile();
    m3.brand = "One plus";
    m3.price = 30000;
    Mobile.name = "SmartPhone";

    Mobile.name = "Phone";

    m1.show();
    m2.show();
    m3.show();
  }
}
