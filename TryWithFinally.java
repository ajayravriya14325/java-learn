public class TryWithFinally {

  public static void main(String[] args) {
    
    int i = 0;
    int j = 0;

    try{
      j = 18/i;
    }catch(Exception e){
      System.out.println("Thats the default output "+ e);
    }finally{ //finally block excute in both case try as well as catch
      System.out.println("Bye");
    }
  }
  
}
