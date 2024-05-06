package Arrays.TwoDArray;

import java.util.Scanner;

public class TwoArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
        int col=scanner.nextInt();
        int numbers[][]=new int [rows][col];
        for(int i=0; i<rows;i++){

            for(int j=0;j<col;j++){
                numbers[i][j]=scanner.nextInt();
            }
        }
        int x=scanner.nextInt();
        for(int i=0; i<rows;i++){

            for(int j=0;j<col;j++){
                if(numbers[i][j]==x){
                    System.out.print("index:"+i + j);
                }
                
            }
            System.out.println();
        }


        scanner.close();
    }
}
