package Task5;

import java.util.Scanner;

public class TaskF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double summ = 0;
        for (double i = 1; i <= n; i++) {
            summ += ((double)1)/(i * i);
        }
        System.out.println(summ);
    }
}
