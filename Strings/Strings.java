package Strings;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

    String firstName=scanner.nextLine();
    String lastName=scanner.nextLine();
    //concatenation
    String fullName=firstName+lastName;
    System.out.println("full name:"+fullName);
    //acessing character
    for(int i=0;i<firstName.length();i++){
        System.out.println(firstName.charAt(i));
    }
//compare to
if(firstName.compareTo(lastName)==0){
    System.out.println("equal");
    
}else if (firstName.compareTo(lastName)>0) {
    System.out.println("first name is greater");
    
}

else{
    System.out.println("not equal");
}

//subString
System.out.println(fullName.substring(0,6));
        scanner.close();
    }
    
    
}
