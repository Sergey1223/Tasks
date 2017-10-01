package Task1;

import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double temp = x * x;                                // x^2
        double temp1 = temp * temp;                         // x^4
        temp = temp1 * temp1;                               // x^8
        temp *= temp;                                       // x^16
        System.out.println(temp * temp1 * x);               // x^21
    }
}
