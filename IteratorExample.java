
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;


public class IteratorExample {
  public static void main(String[] args) {

    Collection<Integer> numbers = new TreeSet<Integer>();
    numbers.add(6);
    numbers.add(10);
    numbers.add(20);
    numbers.add(15);
    numbers.add(8);
    numbers.add(6);
    
    Iterator<Integer> values = numbers.iterator();

    while (values.hasNext()) {
      System.out.println(values.next());
    }
  }
}
