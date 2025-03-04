/*
 * Problem Definition:
 * Create a program that determines whether a given year is a leap year.
 * The program should:
 * 1. Prompt the user to enter a year.
 * 2. Print whether the year is a leap year or not.
 */

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
