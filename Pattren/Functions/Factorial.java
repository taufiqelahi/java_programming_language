package Pattren.Functions;

import java.util.Scanner;

public class Factorial {
    public static void calculateFactorial(int n) {
        if(n<0){
            System.out.println("Invalid number");
            return;
        }
        int value=1;
        for (int i = n; i >= 1; i--) {
            value = value * i;
        }
        System.out.println(value);
        return ;
    }

    public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
int n=scanner.nextInt();

calculateFactorial(n);

    }
}
