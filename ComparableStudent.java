
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
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

  @Override
  public int compareTo(Student that) {
    if(this.age > that.age){
      return 1;
    }else{
      return -1;
    }
  }
  
}

public class ComparableStudent {
  public static void main(String[] args) {
    
    List<Student> studs = new ArrayList<>();
    studs.add(new Student(21,"Navin"));
    studs.add(new Student(18,"John"));
    studs.add(new Student(12,"Kiran"));
    studs.add(new Student(25,"Ajay"));

    Collections.sort(studs);
    for(Student s : studs){
      System.out.println(s);
    }
  }
}

