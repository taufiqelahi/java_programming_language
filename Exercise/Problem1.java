package Exercise;

import java.util.Scanner;

public class Problem1 {
    public static void calculateAvarage(double a,double b, double c){

double avarage=(a+b+c)/3;
String formateAvarage=String.format("%.2f", avarage);
System.out.println("Average ="+formateAvarage);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter value of a");
        int a=scanner.nextInt();
        System.out.println("enter value of b");
        int b=scanner.nextInt();
        System.out.println("enter value of c");
        int c=scanner.nextInt();
        calculateAvarage(a, b, c);
    }
    
}
