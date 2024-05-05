package Arrays;

import java.util.Scanner;

public class FindingMinMax {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size= scanner.nextInt();
        int [] numbers=new int [size];
        
        for(int i=0;i<size;i++){
            numbers[i]=scanner.nextInt();
        }
        int max=numbers[0];
        int min=numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<min){
                min=numbers[i];
            }
            if(numbers[i]>max){
                max=numbers[i];
            }
            System.out.println(numbers[i]);
        }

        System.out.println("min:"+min);
        System.out.println("max:"+max);

        
    }
    
}
