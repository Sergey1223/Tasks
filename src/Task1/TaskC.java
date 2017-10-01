package Task1;

import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double temp = x * x;                                // x^2
        x = temp * temp;                                    // x^4
        System.out.println(x * temp);                       // x^6
    }
}
