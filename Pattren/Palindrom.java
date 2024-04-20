package Pattren;
/**
 * Palindrom
 */
public class Palindrom {

    public static void main(String[] args) {
        int rows=5;
        for(int i=1;i<=rows;i++){
           for(int j=1;j<=2*(rows-i);j++){
            System.out.print(' ');
           }
            for(int j=i;j>=1;j--){

             
                if (j!=1) {
                    
                    System.out.print(" " +j);
                    
                } else{
                    System.out.print(' ');
                }
                  
                
               
            }
            for(int j=1;j<=i;j++){

             
                   
          
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}