import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithFinally {

  public static void main(String[] args) throws NumberFormatException, IOException {
    
    int nums = 0;
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
    {
      System.out.println("Enter a number");
      nums = Integer.parseInt(br.readLine());

      System.out.println(nums);

    }
  }
  
}
