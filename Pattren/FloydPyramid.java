package Pattren;
public class FloydPyramid {
    public static void main(String[] args) {
        int n=5;
        int r=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(r +" ");
                r++;

            }
            System.out.println();
        }
    }
    
}
