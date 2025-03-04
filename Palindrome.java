/*
 * Problem Definition:
 * Create a program that checks whether a given word is a palindrome.
 * The program should:
 * 1. Prompt the user to enter a word.
 * 2. Print whether the word is a palindrome or not.
 */

 import java.io.*;

 public class Palindrome {
     // Method to check if a string is a palindrome
     public static boolean isPalindrome(String s) {
         int left = 0, right = s.length() - 1;
 
         while (left < right) {
             if (s.charAt(left) != s.charAt(right)) {
                 return false;  
             }
             left++;
             right--;
         }
 
         return true; 
     }
 
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         PrintWriter out = new PrintWriter(System.out);
 
         // Prompt user for input
         out.print("Enter a word: ");
         out.flush();
         String word = br.readLine();
 
         // Check and print result
         if (isPalindrome(word)) {
             out.println("It's a palindrome!");
         } else {
             out.println("It's not a palindrome!");
         }
         out.flush();
     }
 }
 