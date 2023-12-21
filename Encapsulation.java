class Human{
  //private var we can't access directly out side the class
  private int age = 25;
  private String name = "Ajay";

  public int getAge(){
    return age;
  }

  public void setAge(int a){
    age = a;
  }

  public String getName(){
    return name;
  }

  public void setName(String n){
    name = n;
  }
}

public class Encapsulation {
  public static void main(String a[]){

    Human h1 = new Human();
    //Set private var value via method
    h1.setAge(20);
    h1.setName("Ravriya");

    //private var we can access via method call outside the class
    System.out.println(h1.getName() + " : " + h1.getAge());
  }
}
