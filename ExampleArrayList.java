import java.util.ArrayList;
import java.util.Collection;

public class ExampleArrayList {
  public static void main(String[] args) {
    
    Collection<Integer> numbers = new ArrayList<Integer>();
    numbers.add(6);
    numbers.add(10);
    numbers.add(20);
    numbers.add(15);
    numbers.add(8);
    
    System.out.println("ArrayList "+numbers);

    for(int n : numbers){
      System.out.println("For each loop" +n);
    }
  }
}
