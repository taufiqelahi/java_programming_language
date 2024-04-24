package Functions;

import java.util.Scanner;

public class MutiplyNumber {
    public static int porductOfNumbers(int a, int b){
        int product=a*b;
        System.out.println(product);
        return product;
            }
            
            public static void main(String[] args) {
                Scanner scanner=new Scanner(System.in);
                int a= scanner.nextInt();
               int  b= scanner.nextInt();
               porductOfNumbers(a, b);
               scanner.close();
            }
}
