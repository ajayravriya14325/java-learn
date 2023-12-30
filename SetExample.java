
import java.util.HashSet;
import java.util.Set;


public class SetExample {
  public static void main(String[] args) {
    //Set for unique value not support sequance
    //List for accessing via index value
    //Collection normal value
    Set<Integer> numbers = new HashSet<Integer>();
    numbers.add(6);
    numbers.add(10);
    numbers.add(20);
    numbers.add(15);
    numbers.add(8);
    numbers.add(6);
    
    for(int n : numbers){
      System.out.println(n);
    }
  }
}