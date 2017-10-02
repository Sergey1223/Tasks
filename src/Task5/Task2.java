package Task5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte number = scanner.nextByte();
        int summ = 0;
        for (byte i = 1; i <= number; i++) {
            for (byte j = 0; j <= i; j++) {
                summ += j;
            }
        }
        System.out.println(summ);
    }
}
