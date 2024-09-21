package Practice;

public class PracticePrattren19 {
    public static void main(String[] args) {
        int n=5;

        for(int i=1;i<n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print("*");
            }
            for(int j=2;j<2*i;j++){
                System.out.print(" ");
            }
            for(int j=n-i;j>0;j--){
                System.out.print("*");
            }
    
            System.out.println();
            
        }
        for(int k=1;k<n;k++){
            for(int j=1;j<=k;j++){
                System.out.print("*");
            }
            for(int j=2*n-2*k-2;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=k;j++){
                System.out.print("*");
            }
            System.out.println();
        }
   
        
    }
    
}
