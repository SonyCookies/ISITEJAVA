/**
 * Problem Definition:
 * Create a program that calculates the sum of digits of a given number.
 * The program should:
 * 1. Prompt the user to enter a number.
 * 2. Extract each digit and compute the sum.
 * 3. Print the sum of the digits.
 */

import java.io.*;
import java.util.*;

public class SumOfDigits {
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);

    out.print("Enter a number: "); out.flush();
    String nums = scanner.nextLine();

    // int sum = 0;
    // for (char digit: nums.toCharArray()) {
    //   if (Character.isDigit(digit)) {
    //     sum += Character.getNumericValue(digit);
    //   }
    // }

    int sum = 0;
    for (int i = 0; i < nums.length(); i++) {
      char digit = nums.charAt(i);
      if (digit >= '0' && digit <= '9') {
        sum += digit - '0';
      }
    }

    out.println("Sum: " + sum); out.flush();

  }
}
