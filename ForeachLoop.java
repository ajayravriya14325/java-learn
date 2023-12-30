import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForeachLoop {
  public static void main(String[] args) {
    
    List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

    Consumer<Integer> con = (Integer t) -> {
        System.out.println(t);
    };

    nums.forEach(con);

    nums.forEach(t -> System.out.println(t)); //sortcut
  }
}
