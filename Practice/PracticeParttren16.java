package Practice;

public class PracticeParttren16 {
    public static void main(String[] args) {
        
        int n=4;
        for(int i=0;i<=n;i++){
            for(int j=0;j<n-i+1;j++){
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print((char)('A' + j));
            }

            // Print the second part: from (i-1)th letter back to 'A'
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char)('A' + j));
            }
            System.out.println();
        }
    }
    
}
