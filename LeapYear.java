import java.io.*;
import java.util.*;


public class LeapYear {
  public static boolean isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
  }


  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    out.print("Enter a year: "); out.flush();
    int year = Integer.parseInt(br.readLine());

    if(isLeapYear(year)) {
      out.println("It's a leap year!"); out.flush();
    } else {
      out.println("It's not a leap year!"); out.flush();

    }
  }
}
