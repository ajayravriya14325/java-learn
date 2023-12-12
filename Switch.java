public class Switch {
  public static void main(String args[]){
    
    String day = "Sunday";
    String result = "";

    result = switch (day) {
      case "Saturday", "Sunday": yield "8 am";
      case "Monday": yield "6 am";
      default: yield "7 am";
    };

    System.out.println(result);
  }
}
