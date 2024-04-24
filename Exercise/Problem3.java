package Exercise;

import java.util.Scanner;

public class Problem3 {
    public static int findGreaterNumber(int a, int b){
        if(a>b){
           return a; 
        }else{
         return b;

        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
       int result= findGreaterNumber(a, b);

       System.out.println("the Graeter number is "+ result);
    }
}
