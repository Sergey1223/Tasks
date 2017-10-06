package Task10;

import java.util.Scanner;

public class TaskF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(power(scanner.nextDouble(), scanner.nextInt()));
    }

    static double power(double a, int n){
        if(a == 0){
            return 0;
        }
        if(a == 1){
            return a;
        }
        else {
            if(n == 0){
                return 1;
            }
            if(n < 0){
                //return 1/a * power(a, (short) (n + 1));
                return ((n & 1) == 1) ? 1/a * power(a, n + 1) : power(a * a, n/2);
            }
            else return ((n & 1) == 1) ? a * power(a, n - 1) : power(a * a, n/2);
        }
    }
}