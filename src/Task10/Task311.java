package Task10;

import java.util.Scanner;

public class Task311 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(power(scanner.nextDouble(), scanner.nextInt()));
    }

    static double power(double a, int n){
        if(n == 0){
            return 1;
        }
        else return ((n & 1) == 1) ? a * power(a, n - 1) : power(a * a, n/2);
    }
}
