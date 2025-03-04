import java.io.*;

public class IsPrime {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        out.print("Enter a number: "); 
        out.flush();
        
        int num = Integer.parseInt(br.readLine());
        boolean isPrime = true;


        if (num <= 1) isPrime = false;
        else {
            for (int i = 2; i * i < num; i++){
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        out.println(num + " is a prime number: " + isPrime);
        out.flush();
        
    }
}
