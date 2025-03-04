import java.io.*;
import java.util.*;


public class SumOfPrime {

  public static boolean isPrime(int n) {
    if (n < 2) return false;
    else {
      for (int i = 2; i * i < n; i++) {
        if (n % i == 0) {
          return false;
        }
      }
    }
    return true;
  }


  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    out.print("Enter a space-separated numbers: "); out.flush();
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = st.countTokens();
    int[] nums = new int[n];

    for (int i = 0; i < n; i++) {
      nums[i] = Integer.parseInt(st.nextToken());
    }

    int sum = 0;

    for (Integer num: nums) {
      if (isPrime(num)) {
        sum += num;
      }
    }

    out.println("Sum of prime numbers: " + sum); out.flush();

  }
}
