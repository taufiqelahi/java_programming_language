package Pattren;
public class SolidRomBus {
    public static void main(String[] args) {
        
        int rows=5;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                
                System.out.print(' ');
            }
            for(int j=1;j<=rows;j++){
                System.out.print('*');
                System.out.print(' ');
            }
            System.out.println();
        }
    }
    
}
