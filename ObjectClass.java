class Laptop{
  String model;
  int price;

  public String toString(){
    return model + " : " + price;
  }

  public boolean equals(Laptop that){
    if(this.model.equals(that.model) && this.price == that.price){
      return true;
    }else{
      return false;
    }
  }
}

public class ObjectClass {
  public static void main(String[] args) {
    Laptop obj = new Laptop();
    obj.model = "Lenovo Yoga";
    obj.price = 10000;

    Laptop obj1 = new Laptop();
    obj1.model = "Lenovo Yoga";
    obj1.price = 10000;

    boolean result = obj.equals(obj1);

    System.out.println(result);
  }
}
