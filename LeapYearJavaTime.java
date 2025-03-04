import java.io.*;
import java.util.*;
import java.time.Year;


public class LeapYearJavaTime {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    out.print("Enter a year: "); out.flush();
    int year = Integer.parseInt(br.readLine());

    out.println(year + " is a leap year? " + Year.of(year).isLeap()); out.flush();
  }
}
