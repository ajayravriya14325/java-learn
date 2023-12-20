class Mobile{
  String brand;
  int price;
  //Static var change the all object value and static var value share with all object
  //Static var is a class member not a object member
  static String name; 

  public void show(){
    System.out.println(brand + " : " + price + " : " + name);
  }

  public static void show1(){
    //non static var we can't access in static method only we can access static var in static method
    //System.out.println(brand + " : " + price + " : " + name);
    System.out.println("Static method");
  }

  public static void show2(Mobile obj){
    //in static method if var is not static then we can pass object as parameter
    System.out.println(obj.brand + " : " + obj.price + " : " + name);
    
  }
}

public class DemoStaticMethod {
  public static void main(String a[]){
    Mobile m1 = new Mobile();
    m1.brand = "Apple";
    m1.price = 80000;
    // static var should be called via class name not object name
    Mobile.name = "SmartPhone";

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
    // static method should be called via class name not object name
    Mobile.show1();
    //when we call static method if we need to access object value then need to pass object as arguments
    Mobile.show2(m1);
  }
}
