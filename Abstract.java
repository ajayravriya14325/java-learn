//if we are adding abstract in method then we need to add abstract keyword in that method class
//we can't create object of abstract class
//if we have abstract class then don't need to add abstract method if not needed
abstract class Car {

  //if we are declear a method then we need to add abstract keyword in method declearation
  public abstract void drive();
  public abstract void fly();

  public void playMusic(){
    System.out.println("Play music");
  }
}

abstract class WagonR extends Car{
  //abstract method is decleared then definition also needed
  public void drive(){
    System.out.println("Driving...");
  }
}

class UpdatedWagonR extends WagonR{

  public void fly(){
    System.out.println("Fly...");
  }
}


public class Abstract {
  public static void main(String[] args) {

    Car obj = new UpdatedWagonR();
    obj.drive();
    obj.playMusic();
    obj.fly();
  }
}
