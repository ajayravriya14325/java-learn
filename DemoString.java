public class DemoString {
  //Strings are immutable
  public static void main(String a[]){
    String name = "Ajay";
    name = name + " Ravriya"; // you are changing referance address Ajay to Ajay Ravriya
    System.out.println(name);

    String s1 = "Ajay"; //line no 7 and 8 both are having same string value means both the value refering to one object not two diffrent object
    String s2 = "Ajay";

    System.out.println(s1 == s2);
  }
}
