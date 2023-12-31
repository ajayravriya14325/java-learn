import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MapReducerSorted {
  public static void main(String[] args) {
    
    List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

    //Function for defining map logic apply method
    //without lamda expression
    //Function<Integer, Integer> fun = new Function<>() {
    //  @Override
    //  public Integer apply(Integer t) {
    //    return t*t;
    //  }
    //};
      

    //with lamda expression
    Function<Integer, Integer> fun = t -> t*t;

    int result =nums.stream()
                    .filter(n -> n%2==0)
                    .map(fun)
                    .reduce(0, (c,e) -> c+e); //plus all square of even number

    System.out.println(result);
  }
}
