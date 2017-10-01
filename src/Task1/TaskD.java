package Task1;

import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double temp = x * x;                                // x^2
        double temp1 = temp * temp;                         // x^4
        System.out.println(temp * temp1 * x);               // x^7
    }
}
