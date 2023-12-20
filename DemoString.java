public class DemoString {
  public static void main(String a[]){
    String name = "Ajay";
    name = name + " Ravriya";
    System.out.println(name);

    String s1 = "Ajay"; //line no 7 and 8 both are having same string value means both the value refering to one object not two diffrent object
    String s2 = "Ajay";

    System.out.println(s1 == s2);
  }
}
