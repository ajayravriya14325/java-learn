import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterReducerSorted {
  public static void main(String[] args) {
    
    List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

    //Predicate for defining filter logic test method
    //without lamda expression
    //Predicate<Integer> p = new Predicate<Integer>() {
    //  @Override
    //  public boolean test(Integer t) {
    //    if(t%2==0)
    //      return true;
    //    else
    //      return false;
    //  }
      
    //};

    //with lamda expression
    Predicate<Integer> p = t -> t%2==0;

    int result =nums.stream()
                    .filter(p)
                    .map(n -> n*n)
                    .reduce(0, (c,e) -> c+e); //plus all square of even number

    System.out.println(result);
  }
}
