package Task5;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte number = scanner.nextByte();
        int summ = 0;
        for (byte i = 1; i <= number; i++) {
            summ += i * i;
        }
        System.out.println(summ);
    }
}
