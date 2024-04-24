package Exercise;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int value=0;
        char choice;
        

        do {
System.out.println("enter your number:");
int number=scanner.nextInt();
value=value+number;

System.out.println("Do you want to enter another number? (y/n):");

choice=scanner.next().charAt(0);
            
        } while (choice=='y'||choice=='Y');
        System.out.println("Total value of enter number:" +value);
        scanner.close();
    }
    
}
