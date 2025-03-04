/*
 * Problem Definition:
 * Create a program that determines whether a given year is a leap year.
 * The program should:
 * 1. Prompt the user to enter a year.
 * 2. Print whether the year is a leap year or not.
 */

 import java.io.*;

 public class LeapYear {
 
     // Method to check if a year is a leap year
     public static boolean isLeapYear(int year) {
         return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
     }
 
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         PrintWriter out = new PrintWriter(System.out);
 
         // Prompt user for input
         out.print("Enter a year: ");
         out.flush();
         int year = Integer.parseInt(br.readLine());
 
         // Check and print result
         if (isLeapYear(year)) {
             out.println("It's a leap year!");
         } else {
             out.println("It's not a leap year!");
         }
         out.flush();
     }
 }
 