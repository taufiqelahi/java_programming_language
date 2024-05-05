package Arrays;

import java.util.Scanner;

public class SearchNumber {
   public  static int LinearSearch(int[] number,int x){
        for(int i=0;i<number.length;i++){
            System.err.println(i);
            if(number[i]==x){
                
            return i;
            }
          
            
        }
        return -1;
     }
    
   public static void main(String[] args) {
    
    
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter your array Size:");
    int size=scanner.nextInt();
    System.out.println("Enter list of number");
    int number[]=new int [size];
    for(int i=0;i<size;i++){
        number[i]=scanner.nextInt();
    }

    System.out.println("Enter your finding number");
    int x=scanner.nextInt();

    int result= LinearSearch(number,x);
    System.out.println("Index :"+result);
   

    scanner.close();
   }

    
}
