package Task1;

import java.util.Scanner;

public class TaskF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int tmp = x/10;
        System.out.println(x - tmp * 10);
    }
}
