import java.util.HashMap;
import java.util.Map;

public class MapExample {
  public static void main(String[] args) {
    
    Map<String,Integer> students = new HashMap<>();
    students.put("Navin", 74);
    students.put("Harish", 60);
    students.put("Sushil", 62);
    students.put("Kiran", 53);
    students.put("Harish", 43);

    System.out.println(students.keySet());
    System.out.println(students.values());

    for(String key: students.keySet()){
      System.out.println(key + " : " + students.get(key));
    }
  }
}
