/*
 * Problem Definition:
 * Create a program that determines whether a given number is prime.
 * The program should:
 * 1. Prompt the user to enter a number.
 * 2. Read the input and convert it to an integer.
 * 3. Print whether the number is prime or not.
 */

 import java.io.*;

 public class IsPrime {
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         PrintWriter out = new PrintWriter(System.out);
 
         // Prompt user for input
         out.print("Enter a number: "); 
         out.flush();
         
         int num = Integer.parseInt(br.readLine());
         boolean isPrime = true;
 
         // Prime number check logic
         if (num <= 1) {
             isPrime = false;  // Numbers ≤ 1 are not prime
         } else {
             for (int i = 2; i * i <= num; i++) { 
                 if (num % i == 0) {  
                     isPrime = false;
                     break;
                 }
             }
         }
 
         // Output the result
         out.println(num + " is a prime number: " + isPrime);
         out.flush();
     }
 }
 