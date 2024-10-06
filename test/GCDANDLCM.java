package test;

public class GCDANDLCM {
    public static void main(String[] args) {
        int a = 14;
        int b = 8;
        int n = 0;
        int gcd = 1;
        int Lcm = 0;
        if (a > b) {
            n = a;
        } else {
            n = b;
        }
        for (int i = 1; i <= n; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        
        
        }
        Lcm= (a*b)/gcd;
        System.out.println(gcd + " " + Lcm);

    }

}
