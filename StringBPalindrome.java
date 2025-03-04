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
