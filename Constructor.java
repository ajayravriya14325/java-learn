class Human{
  //private var we can't access directly out side the class
  private int age = 25;
  private String name = "Ajay";

  //Constructor is special method. it has same name as a class name and its never return anuthing.
  public Human(){ // default constructor
    age = 12;
    name = "John";
    //System.out.println("Its constructor method");
  }

  public Human(int age,String name){ //Parameterised constructor
    this.age = age;
    this.name = name;
  }

  public int getAge(){
    return age;
  }

  public void setAge(int age,Human obj){
    Human obj1 = obj; //this is not correct in java instance of we can use this keyword
    obj1.age = age;
  }

  public String getName(){
    return name;
  }

  public void setName(String name){
    //this refers current object who is calling the method.
    this.name = name;
  }
}

public class Constructor {
  public static void main(String a[]){
    //when object is created then constructor method is called
    Human h1 = new Human();
    Human h2 = new Human(18,"Navin");

     System.out.println(h1.getName() + " : " + h1.getAge());
     System.out.println(h2.getName() + " : " + h2.getAge());
    //Set private var value via method
    h1.setAge(20,h1);
    h1.setName("Ravriya");

    //private var we can access via method call outside the class
   
  }
}
