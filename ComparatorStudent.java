
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
  int age;
  String name;
  
  public Student(int age, String name) {
    this.age = age;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Student [age=" + age + ", name=" + name + "]";
  }
  
}

public class ComparatorStudent {
  public static void main(String[] args) {
    //if you want to sepecify which logic you want to sort the element use Comparator
    Comparator<Student> com = new Comparator<Student>() {
      public int compare(Student i, Student j) {
        if(i.age > j.age){
          return 1;
        }else{
          return -1;
        }
      }
    };
    
    List<Student> studs = new ArrayList<>();
    studs.add(new Student(21,"Navin"));
    studs.add(new Student(18,"John"));
    studs.add(new Student(12,"Kiran"));
    studs.add(new Student(25,"Ajay"));

    Collections.sort(studs, com);
    for(Student s : studs){
      System.out.println(s);
    }
  }
}
