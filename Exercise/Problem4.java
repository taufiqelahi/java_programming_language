package Exercise;

import java.util.Scanner;

public class Problem4 {
    public static void calculatedCircumference(double r){
double circumfence=2* Math.PI * r;
String formateCircumfence=String.format("%2f", circumfence);
System.out.println(formateCircumfence);

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
double r=scanner.nextDouble();
calculatedCircumference(r);
scanner.close();
    }
}
