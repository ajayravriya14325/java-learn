class Computer {

  public void playMusic(){
    System.out.println("Play the music...");
  }

  public String getAPen(int cost){
    if(cost >= 10){
      return "Pen";
    }else{
      return "Give at least 10 or multiple of 10";
    }
    
  }
}

public class Method {
  public static void main(String args[]){
    
    Computer object = new Computer();

    object.playMusic();
    String Str = object.getAPen(2);

    System.out.println(Str);


  }
}
