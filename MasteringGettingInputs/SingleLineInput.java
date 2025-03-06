import java.io.*;
import java.util.*;

public class SingleLineInput {
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);

    out.print("Enter a single-line texts or passage: "); out.flush();
    String[] input = scanner.nextLine().split("");

    System.out.println("Input in array: " + Arrays.toString(input));
  }
}