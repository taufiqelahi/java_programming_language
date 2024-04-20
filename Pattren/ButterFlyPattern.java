package Pattren;
public class ButterFlyPattern {
    
    public static void main(String[] args) {
        int x=4;
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print('*' );
            }
            for(int j=1;j<=2*(x-i);j++){
                System.out.print(' ');
            }
           
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
           
            System.out.println();
            
        }
        for(int k=x;k>=1;k--){
            
            for(int j=1;j<=k;j++){
                System.out.print('*');
            }
            for(int j=1;j<=2*(x-k);j++){
                System.out.print(' ');
            }
            
            for(int j=1;j<=k;j++){
                System.out.print('*');
            }
            System.out.println();
           
        }
    }
}
