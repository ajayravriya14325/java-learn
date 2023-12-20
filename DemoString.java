public class DemoString {
  public static void main(String a[]){
    String name = "Ajay"; // this is not correct becoz String is a class
    String name1 = new String("Vijay");
    System.out.println(name + " " + name1);
    System.out.println(name.hashCode());
  }
}
