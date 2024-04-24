package Functions;

import java.util.Scanner;

public class GivenName {
    public static void printAGivenName(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String username=scanner.nextLine();
        printAGivenName(username);
        scanner.close();

    }
    
}
