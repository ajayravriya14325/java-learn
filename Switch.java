public class Switch {
  public static void main(String args[]){
    
    String day = "Sunday";

    switch (day) {
      case "Saturday", "Sunday":
        System.out.println("8 am");
        break;
      case "Monday":
        System.out.println("6 am");
        break;
      default:
        System.out.println("7 am");
    }
  }
}
