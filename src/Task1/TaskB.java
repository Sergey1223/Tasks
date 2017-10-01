package Task1;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double temp = x * x;                                 // x^2
        System.out.println(temp * temp);                     // x^4
    }
}
