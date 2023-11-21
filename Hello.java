/**
 * Hello
 */
class Hello {
  public static void main(String args[])
  {
    //Type conversion
    byte d = 127; //output 127
    int e = d; //Conversion

    int b = 12; //output 12
    byte c = b; //Conversion

    int a = 257; //output 1 returning modulus % 
    byte k = (byte)a; //Emplicity Costing

    float f =5.6f;//output 5
    int t = (int)f; //Emplicity Costing 

    System.out.println(t);
    
  }
}