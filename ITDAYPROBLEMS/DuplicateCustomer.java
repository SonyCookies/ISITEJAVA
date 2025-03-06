/*
 * Problem Definition:
 * Create a program that allows users to enter customer numbers and detects duplicates.
 * The program should:
 * 1. Prompt the user to enter the number of customers.
 * 2. Read and store each customer's number in an array.
 * 3. After input, check if duplicates exist:
 *    - If no duplicates are found, print "HONEST CUSTOMERS".
 *    - If duplicates exist, print each duplicate customer number.
 */

 import java.io.*;
 import java.util.*;
 
 public class DuplicateCustomer {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         PrintWriter out = new PrintWriter(System.out);
 
         out.print("Enter the number of customers: "); 
         out.flush();
         int n = sc.nextInt();
 
         int[] arr = new int[n];
 
         // HashSet to track unique numbers
         HashSet<Integer> seen = new HashSet<>();
         // HashSet to store duplicate numbers
         HashSet<Integer> dups = new HashSet<>();
 
         // Read customer numbers and check for duplicates
         for (int i = 0; i < arr.length; i++) {
             out.print("Customer number: "); 
             out.flush();
             arr[i] = sc.nextInt();
 
             // If the number is already in 'seen', add it to 'dups'
             if (!seen.add(arr[i])) {
                 dups.add(arr[i]);
             }
         }
 
         // Print results based on whether duplicates exist
         if (dups.isEmpty()) {
             out.println("HONEST CUSTOMERS");
         } else {
             for (int num : dups) {
                 out.println("Duplicate: Customer #" + num);
             }
         }
         out.flush();
     }
 }
 