package Task5;

import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        int n = scanner.nextInt();
        double summ = (a == 0) ? 0 : 1;
        double temp = a;
        for (int i = 1; i <= n; i++) {
            summ += temp;
            temp *= a;
        }
        System.out.println(summ);
    }
}
