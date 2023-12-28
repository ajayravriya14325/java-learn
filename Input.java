import java.io.IOException;

public class Input {
  public static void main(String[] args) throws IOException {

    System.out.println("Enter a number");
    int num = System.in.read();
    System.out.println(num - 48);
  }
}
