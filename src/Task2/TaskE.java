package Task2;

import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        byte i = scanner.nextByte();
        int mask  = 1 << i;
        System.out.println(a | mask);
    }
}
