import java.util.Set;
import java.util.TreeSet;


public class SetWithTree {
  public static void main(String[] args) {
    //Set for unique value not support sequance
    //List for accessing via index value
    //Collection normal value
    //TreeSet for sorted element
    //HasSet for unordered element
    Set<Integer> numbers = new TreeSet<Integer>();
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