package Exercise;

import java.util.Scanner;

public class Problem5 {
    public static void findVoter(int age){
        if(age>18){
            System.out.println("Your are eligible for given vote");
        }else{
            System.out.println("You are not eligilbe for vote");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=scanner.nextInt();
        findVoter(age);
    }
    
}
