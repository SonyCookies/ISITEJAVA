/*
 * Problem Definition:
 * Create a program that allows the user to generate different star patterns.
 * The program should:
 * 1. Ask the user how many rows they want.
 * 2. Provide a menu of pattern choices:
 *    - Right Triangle
 *    - Inverted Right Triangle
 *    - Pyramid
 *    - Inverted Pyramid
 *    - Diamond
 *    - Hollow Square
 * 3. Based on the user's choice, generate and print the corresponding pattern.
 */

 import java.io.*;

 public class Patterns {
 
   // Right Triangle Pattern
   public static void RightTriangle(int rows) {
     for (int i = 1; i <= rows; i++) {
       for (int j = 1; j <= i; j++) { 
         System.out.print("* ");
       }
       System.out.println();
     }
   }
 
   // Inverted Right Triangle Pattern
   public static void InvertedRightTriangle(int rows) {
     for (int i = 0; i <= rows; i++) {
       for (int j = rows; j > i; j--) {
         System.out.print("* ");
       }
       System.out.println();
     }
   }
 
   // Pyramid Pattern
   public static void Pyramid(int rows) {
     for (int i = 1; i <= rows; i++) {
       for (int j = rows; j > i; j--) {
         System.out.print(" ");
       }
       for (int k = 1; k <= (2 * i - 1); k++) {
         System.out.print("*");
       }
       System.out.println();
     }
   }
 
   // Inverted Pyramid Pattern
   public static void InvertedPyramid(int rows) {
     for (int i = rows; i >= 1; i--) { 
       for (int j = i; j < rows; j++) {
         System.out.print(" ");
       }
       for (int k = 1; k <= (2 * i - 1); k++) {
         System.out.print("*");
       }
       System.out.println();
     }
   }
 
   // Diamond Pattern (Combination of Pyramid and Inverted Pyramid)
   public static void Diamond(int rows) {
     for (int i = 1; i <= rows; i++) {
       for (int j = rows; j > i; j--) {
         System.out.print(" ");
       }
       for (int k = 1; k <= (2 * i - 1); k++) {
         System.out.print("*");
       }
       System.out.println();
     }
     for (int i = rows - 1; i >= 1; i--) { 
       for (int j = i; j < rows; j++) {
         System.out.print(" ");
       }
       for (int k = 1; k <= (2 * i - 1); k++) {
         System.out.print("*");
       }
       System.out.println();
     }
   }
 
   // Hollow Square Pattern
   public static void HollowSquare(int rows) {
     for (int i = 1; i <= rows; i++) {
       for (int j = 1; j <= rows; j++) {
         if (i == 1 || i == rows || j == 1 || j == rows) {
           System.out.print("* ");
         } else {
           System.out.print("  ");
         }
       }
       System.out.println();
     }
   }
 
   public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     PrintWriter out = new PrintWriter(System.out);
 
     // Get the number of rows
     out.print("How many rows do you want?: ");
     out.flush();
     int rows = Integer.parseInt(br.readLine());
 
     // Display pattern options
     out.print("Choose which pattern you want:\n" +
               "1. Right Triangle\n" +
               "2. Inverted Triangle\n" +
               "3. Pyramid\n" +
               "4. Inverted Pyramid\n" +
               "5. Diamond\n" +
               "6. Hollow Square\n" +
               "Your choice: ");
     out.flush();
     int pattern = Integer.parseInt(br.readLine());
 
     // Generate the chosen pattern
     switch (pattern) {
       case 1:
         RightTriangle(rows);
         break;
       case 2:
         InvertedRightTriangle(rows);
         break;
       case 3:
         Pyramid(rows);
         break;
       case 4:
         InvertedPyramid(rows);
         break;
       case 5:
         Diamond(rows);
         break;
       case 6:
         HollowSquare(rows);
         break;
       default:
         out.println("Invalid choice! Please select a number between 1 and 6.");
         out.flush();
     }
   }
 }
 