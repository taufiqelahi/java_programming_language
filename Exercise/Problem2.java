package Exercise;

import java.util.Scanner;

public class Problem2 {
    public static void calculateOddNumber(int n){
int value =0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                value=value+i;
            }
        }
        System.out.println("sum of odd number:"+value);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        calculateOddNumber(n);
    }
    
}
