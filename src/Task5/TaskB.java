package Task5;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextByte();
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
