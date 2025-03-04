import java.io.*;
import java.util.*;

public class SumOfDigits {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner scanner = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);

    out.println("Enter a number: "); out.flush();
    String[] nums = scanner.nextLine().split(" ");

    int sum = 0;
    for(int i = 0; i < nums.length; i++) {
      sum+=Integer.parseInt(nums[i]);
    }

    out.println("Sum: " + sum); out.flush();

  }
}
