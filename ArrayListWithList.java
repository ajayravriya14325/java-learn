
import java.util.ArrayList;
import java.util.List;


public class ArrayListWithList {
  public static void main(String[] args) {
    
    List<Integer> numbers = new ArrayList<Integer>();
    numbers.add(6);
    numbers.add(10);
    numbers.add(20);
    numbers.add(15);
    numbers.add(8);
    
    System.out.println("Index value 10 : "+numbers.indexOf(10));
    System.out.println("4th index element : "+ numbers.get(4));
  }
}
