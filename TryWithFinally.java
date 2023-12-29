import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithFinally {

  public static void main(String[] args) throws NumberFormatException, IOException {
    
    int nums = 0;
    BufferedReader br = null;
    try{
      System.out.println("Enter a number");
      br = new BufferedReader(new InputStreamReader(System.in));
      nums = Integer.parseInt(br.readLine());

      System.out.println(nums);

    }
    finally{ //finally block excute in both case try as well as catch
      br.close(); //finally is used to close the resource file,network & database connection, input
    }
  }
  
}
