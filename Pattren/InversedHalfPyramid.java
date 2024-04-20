package Pattren;
public class InversedHalfPyramid {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<=n;i++){
            for(int j=0;j<n-i;j++){
                System.err.print(" ");
            }
            for(int j=0;j<i;j++){
                System.err.print("*");
            }
            System.out.println();
        }
    }
    
}
