package Exercise;

import java.util.Scanner;

public class Problem8 {
    public static double calculatePower(double x, double n){
//double power=Math.pow(x, n);
double power=1;
if(n>=0){
    for(int i=1;i<=n;i++){
        power=power*x;
    }
}
    if(n<0){
        n=-n;
        for(int i=1;i<=n;i++){
            power=power*(1/x);
        }

}
return power;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value base:");
        int x=scanner.nextInt();
        System.out.println("Enter the value exponent or power:");
        int n=scanner.nextInt();
        double result=calculatePower(x, n);
        System.out.println("The result is :" +result);

        scanner.close();
    }
    
}
