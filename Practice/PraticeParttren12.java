package Practice;

public class PraticeParttren12 {
    
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int k=1;k<=2*n-2*i;k++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
          
            System.out.println();
        }
    }
}
