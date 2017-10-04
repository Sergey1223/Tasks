package Task9;

import java.util.Scanner;

public class TaskBB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(power(scanner.nextDouble(), scanner.nextInt()));
    }

    private static double power (double a, int n){
        return Math.pow(a, n);
    }
}
