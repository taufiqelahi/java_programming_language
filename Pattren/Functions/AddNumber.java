package Pattren.Functions;

import java.util.Scanner;

public class AddNumber {
    public static int addNumbers(int a, int b){
int sum=a+b;
System.out.println(sum);
return sum;
    }
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
       int  b= scanner.nextInt();
    addNumbers(a, b);
    }
}
