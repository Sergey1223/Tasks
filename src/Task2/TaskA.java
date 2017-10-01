package Task2;

import java.util.Scanner;
public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int num = scanner.nextInt();
        int mask = Integer.MAX_VALUE;
        System.out.print(number & (mask << num));
    }
}
