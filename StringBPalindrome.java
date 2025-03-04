/**
 * Problem Definition:
 * A palindrome is a word, phrase, number, or sequence of characters that reads the same 
 * forward and backward (e.g., "madam", "racecar"). 
 * The task is to create a Java program that takes a word as input and determines if it is a palindrome. 
 * The program should print "It's a palindrome!" if the input is a palindrome and 
 * "It's not a palindrome!" otherwise.
 */

import java.io.*;
import java.util.*;

public class StringBPalindrome {
  public static boolean isPalindrome(String word) {
    return word.equals(new StringBuilder(word).reverse().toString());
  }


  public static void main(String[] args) throws IOException  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    out.print("Enter a word: "); out.flush();
    String word = br.readLine();

    if(isPalindrome(word)) {
      out.println("It's a palindrome!"); out.flush();
    } else {
      out.println("It's not palindrome!"); out.flush();

    }
  
  }
}
