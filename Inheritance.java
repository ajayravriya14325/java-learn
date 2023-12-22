public class Inheritance {
  public static void main(String[] args) {
    VeryAdvanceCalc obj1 = new VeryAdvanceCalc();

    int r1 = obj1.add(5, 9);
    int r2 = obj1.sub(15, 9);
    int r3 = obj1.multi(5, 9);
    int r4 = obj1.div(15, 9);
    double r5 = obj1.power(4,2);

    System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);
  }
}
