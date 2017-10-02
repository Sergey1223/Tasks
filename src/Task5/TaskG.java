package Task5;

import java.util.Scanner;

public class TaskG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double summ = 1;
        for (double i = 1; i <= n; i++) {
            summ += (((((int)i) & 1) == 1) ? -1 : 1) / (2 * i + 1);
        }
        System.out.println(4 * summ);
    }
}
