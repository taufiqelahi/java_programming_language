package test;

import java.util.List;

public class Type {
    public static void main(String[] args) {
        // int a=switchCase("Character");
        // System.out.println(a);
    }
        static double switchCase(int choice, List<Double> arr){
        // code here
        switch (choice){
            
            case 1:
                return arr.get(0)*arr.get(0);
            case 2:
                return arr.get(0)*arr.get(1);
                default:
                return -1;
        }
        
    }
}
