package Functions;

import java.util.Scanner;

public class Plaindrom {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        String value = scanner.nextLine();
        String result = palindrome(value);
        System.out.println(result);

    }

    public static String palindrome(String value) {
        int left = 0;
        int right = value.length() - 1;
        while (left <= right) {
            char leftside = value.charAt(left);
            char rightside = value.charAt(right);

            if (leftside == rightside) {
                left++;
                right--;
               
            } else{
                return "not palindrom";
            }
           
              
               


        }
        return "plaindrom";
    }

}
