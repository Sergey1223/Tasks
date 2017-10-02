package Task5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        int n = scanner.nextInt();
        System.out.println(power(a, n));
    }

    private static double power(double a, int n){
        if(n == 0){
            return 1;
        }
        else return ((n & 1) == 1) ? a * power(a, n - 1) : power(a * a, n/2);
    }
}
