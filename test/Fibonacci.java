package test;

public class Fibonacci {
    public static void main(String args[]) {
        int n = 6;
        int value2=0;
        int sum =1;
        if (n == 0) {
          System.out.println(0);
        } else {
         
     
          for (int i = 2; i <= n; i++) {
            int temp=sum;
         sum =value2+sum;
          value2=temp;
          }
          System.out.println("The Fibonacci Series up to "+sum+"th term:");
       
        }
      }
    
}
