import java.io.*;
import java.util.*;

public class SecondSmallestInteger {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);


    out.print("Enter the size of array: "); out.flush();
    int n = scanner.nextInt();

    int[] arr = new int[n];

    out.println("Enter "+ n + " integers: "); out.flush();
    for (int i = 0; i < n; i++) {
      out.print(n + ") " ); out.flush();
      arr[i] = scanner.nextInt();
    }

    scanner.close();

    int ss = Integer.MAX_VALUE;
    int s = Integer.MAX_VALUE;

    for (int num: arr) {
      if (num < s) {
        ss = s;
        s = num;
      } else if (num < ss & num != s) {
        ss = num;
      }
    }

    if (ss == Integer.MAX_VALUE) {
      out.println("No second smallest element (all numbers may be the same.)"); out.flush();
    } else {
      out.println("Second smallest integer: " + ss); out.flush();
    }
  }
}
