public class DemoString {
  public static void main(String a[]){
    String name = "Ajay"; // Sortcut most of the this syntax used
    String name1 = new String("Vijay"); // this is correct becoz String is a class
    System.out.println(name + " " + name1);
    System.out.println(name.hashCode());
    System.out.println(name.charAt(0));
    System.out.println(name.concat(" and ") + name1);
  }
}
