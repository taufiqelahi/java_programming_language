package Exercise;

import java.util.Scanner;

public class Problem9 {
    public static int  calculateGCD(int n1,int n2){
     
while ((n1%n2)!=0) {
    int x=n2;
    n2=n1%n2;
    n1=x;
   
}
return n2;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
       int result= calculateGCD(a, b);
       System.out.println("The GCD of " +a+ " and " +b+ " : "+result);
        scanner.close();
    }
    
}
