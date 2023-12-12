public class Switch {
  public static void main(String args[]){
    
    String day = "Sunday";
    String result = "";

    switch (day) {
      case "Saturday", "Sunday" -> result = "8 am";
      case "Monday" -> result = "6 am";
      default -> result = "7 am";
    }

    System.out.println(result);
  }
}
