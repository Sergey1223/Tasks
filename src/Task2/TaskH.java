package Task2;

import java.util.Scanner;

public class TaskH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int i = scanner.nextInt();
        int mask = 0;
        for (int j = 0; j < i; j++) {
            mask <<= 1;
            mask += 1;
        }
        System.out.print(a & mask);
    }
}
