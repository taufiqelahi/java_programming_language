package test;

public class GCDANDLCM {
    public static void main(String[] args) {
        int a = 9;
        int b = 12;
        int n1 = a;
        int n2=b;
        int gcd = 1;
        int Lcm = 0;
      while(n1!=0){
        int temp=n1;
        n1=n2%n1;
        n2=temp;
      }
      gcd=n2;
        Lcm= (a*b)/gcd;
        System.out.println(gcd + " " + Lcm);

    }

}
