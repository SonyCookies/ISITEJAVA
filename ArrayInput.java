/*
 * Problem Definition:
 * Create a program that allows the user to enter space-separated integers 
 * and store them in an array. The program should:
 * 1. Prompt the user to enter a sequence of space-separated integers.
 * 2. Read the input as a single line.
 * 3. Print it as an array in a readable format.
 */

 import java.io.*;
 import java.util.*;
 
 public class ArrayInput {
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         PrintWriter out = new PrintWriter(System.out);
 
         // Prompt the user for space-separated integers
         out.print("Enter space-separated integers: "); 
         out.flush();
 
         // Read user input and split into an array of strings
         String[] input = br.readLine().split(" ");
         int[] arr = new int[input.length];
 
         // Convert string inputs to integers and store them in the array
         for (int i = 0; i < input.length; i++) {
             arr[i] = Integer.parseInt(input[i]);
         }
 
         // Print the resulting integer array
         out.println("Array: " + Arrays.toString(arr));
         out.flush();
     }
 }