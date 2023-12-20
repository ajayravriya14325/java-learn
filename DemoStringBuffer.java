public class DemoStringBuffer {

  public static void main(String arg[]){
    //StringBuffer is mutable and StringBuffer is thread safe and StingBuilder is not
    StringBuffer sb = new StringBuffer("Ajay");
    System.out.println(sb.capacity());
    System.out.println(sb.length());

    sb.append(" Ravriya");
    System.out.println(sb);

    sb.insert(0, "Mrs. ");
    System.out.println(sb);

    sb.deleteCharAt(2);
    sb.setLength(50);
    sb.ensureCapacity(120);
    System.out.println(sb);
  }
}
