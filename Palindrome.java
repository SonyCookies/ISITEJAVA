import java.io.*;
import java.util.*;

public class Palindrome {
  public static boolean isPalindrome(String s) {
    int left = 0, right = s.length() -1;

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

      out.print("Enter a word: "); out.flush();
      String word = br.readLine();

      if(isPalindrome(word)) {
        out.println("It's a palindrome!"); out.flush();
      } else {
        out.println("It's not palindrome!"); out.flush();

      }
  }
}
