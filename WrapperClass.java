public class WrapperClass {
  public static void main(String[] args) {

    int num = 7;
    //taking primative value and storing in a class object is called boxing
    Integer num1 = new Integer(8);
    //automaticaly converted in class object is called autoboxing
    Integer num2 = num;
    //taking class object value and storing in a primative value is called unboxing
    int num3 = num2.intValue();
    //automaticaly converted in primative value is called auto-unboxing
    int num4 = num2;

    String str = "12";
    //Integer is wrapper class
    int num5 = Integer.parseInt(str);

    System.out.println(num5*3);
  }
}
