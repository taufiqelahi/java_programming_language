package Exercise;

import java.util.Scanner;

public class Problem10 {
    public static int calculateFibonacci(int n) {

        if (n <= 1) {
            return n;
        } else {
            int result = 0;
            int a = 0;
            int b = 1;
            for (int i = 2; i <= n; i++) {
                result = a + b;
                a = b;
                b = result;

            }
            return result;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(calculateFibonacci(i));
            System.out.print(" ");
        }
        scanner.close();

    }

}
