import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class StringTokenizerInput {
  public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      PrintWriter out = new PrintWriter(System.out);

      out.print("Enter space-separated integers: ");
      out.flush();
      StringTokenizer st = new StringTokenizer(br.readLine(), ",|-+ "); 

      int n = st.countTokens();
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
        arr[i] = Integer.parseInt(st.nextToken());
      }

      out.println("Array: " + Arrays.toString(arr)); out.flush();
  }
}
