public class Inheritance {
  public static void main(String[] args) {
    AdvanceCalc obj1 = new AdvanceCalc();
    int r1 = obj1.add(5, 9);
    int r2 = obj1.sub(15, 9);
    int r3 = obj1.multi(5, 9);
    int r4 = obj1.div(15, 9);

    System.out.println(r1+" "+r2+" "+r3+" "+r4);
  }
}
