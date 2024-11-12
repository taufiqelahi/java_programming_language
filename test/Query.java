package test;

import java.util.HashMap;
import java.util.Scanner;

public class Query {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //precompute:
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            h.put(arr[i], h.getOrDefault(arr[i], 0)+1);
            hash[arr[i]] += 1;
        }
System.out.println(h);
        int q;
        q = sc.nextInt();
        while (q-- != 0) {
            int number;
            number = sc.nextInt();
            // fetching:
            System.out.println(h.getOrDefault(number,0));
        }
        
    }
}
