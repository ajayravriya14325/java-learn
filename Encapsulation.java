class Human{
  //private var we can't access directly out side the class
  private int age = 25;
  private String name = "Ajay";

  public int getAge(){
    return age;
  }

  public String getName(){
    return name;
  }
}

public class Encapsulation {
  public static void main(String a[]){

    Human h1 = new Human();
    //h1.age = 25;
    //h1.name = "Ajay";

    //private var we can access via method call outside the class
    System.out.println(h1.getName() + " : " + h1.getAge());
  }
}
