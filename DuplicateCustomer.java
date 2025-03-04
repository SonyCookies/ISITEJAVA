/*
  * HashSet<Integer> seen: This set stores unique customer numbers as they are entered.
  *                         If a number is already in 'seen', it means it is a duplicate.
  *
  * HashSet<Integer> duplicates: This set stores numbers that appear more than once.
  *                              If an entry in 'seen' is found again, it is added to 'duplicates'.
  */

import java.io.*;
import java.util.*;


public class DuplicateCustomer {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);

    out.print("Enter the number of customers: "); out.flush();
    int n = sc.nextInt();


    int[] arr = new int[n];

    HashSet<Integer> seen = new HashSet<>();
    HashSet<Integer> dups = new HashSet<>();


    for (int i = 0; i < arr.length; i++){
      out.print("Customer number: "); out.flush();
      arr[i] = sc.nextInt();

      if(!seen.add(arr[i])) {
        dups.add(arr[i]);
      }
    }

    if (dups.isEmpty()) {
      out.println("HONEST CUSTOMERS"); out.flush();
    } else {
      for (int num: dups) {
        out.println("Duplicates: \nCustomer #" + num);
      }
    }
  }
}
