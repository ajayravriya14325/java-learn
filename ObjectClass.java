class Laptop{
  String model;
  int price;

  public String toString(){
    return model + " : " + price;
  }
}

public class ObjectClass {
  public static void main(String[] args) {
    Laptop obj = new Laptop();
    obj.model = "Lenovo Yoga";
    obj.price = 10000;

    System.out.println(obj.toString());
  }
}
