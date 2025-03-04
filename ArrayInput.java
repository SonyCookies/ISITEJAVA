import java.io.*;
import java.util.*;

public class ArrayInput {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        out.print("Enter a space-separated integers: "); 
        out.flush();

        String[] input = br.readLine().split(" ");
        int[] arr = new int[input.length];
        
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        
        out.println("Array: " + Arrays.toString(arr));
        out.flush();
        
    }
}
