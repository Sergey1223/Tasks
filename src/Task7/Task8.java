package Task7;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double summ = 1;
        double fact = 1;
        for (int i = 1; i <= n; i++) {
            summ += 1/fact;
            fact *= i;
        }
        System.out.println(summ);
    }
}
