class Student{
  int rollno;
  String name;
  int marks;
}

public class ArrayObject {
  public static void main(String a[]){

    Student s1 = new Student();
    s1.rollno = 1;
    s1.name = "Ajay";
    s1.marks = 97;

    Student s2 = new Student();
    s2.rollno = 2;
    s2.name = "Vijay";
    s2.marks = 87;

    Student s3 = new Student();
    s3.rollno = 3;
    s3.name = "Sanjay";
    s3.marks = 57;

    Student s4 = new Student();
    s4.rollno = 4;
    s4.name = "Jay";
    s4.marks = 55;

    //System.out.println(s1.name + " : " + s1.marks);

    Student students[] = new Student[4];
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;
    students[3] = s4;

    //for(int i=0; i < students.length; i++){
    //  System.out.println("#" + students[i].rollno + " " + students[i].name + " : " + students[i].marks);
    //}

    for(Student s : students){ //foreach loop
      System.out.println("#" + s.rollno + " " + s.name + " : " + s.marks);
    }
  }
}
