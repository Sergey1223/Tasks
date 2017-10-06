package Task10;

import java.util.Scanner;

public class Task5 {
    private static Scanner scanner = new Scanner(System.in);
    private static Integer x = scanner.nextInt();
    private static Integer y = scanner.nextInt();

    public static void main(String[] args) {
        System.out.printf("x - %d\ny - %d\n", x, y);
        swap(x, y);
        System.out.printf("x - %d\ny - %d", x, y);
    }

    private static void swap(Integer a, Integer b){
        x = b;
        y = a;
    }
}
