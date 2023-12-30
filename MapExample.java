import java.util.HashMap;
import java.util.Map;

public class MapExample {
  public static void main(String[] args) {
    //HasTable for synchronized(one thread excute at one time) working with multiple thread at a time
    //HasMap for working with singal thread at a time
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
