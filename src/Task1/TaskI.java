package Task1;

import java.util.Scanner;

public class TaskI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int tmp = x;
        int summ = 0;
        for (int i = 0; i < 2; i++) {
            tmp /= 10;
            summ += (x - tmp * 10);
            x = tmp;
        }
        System.out.println(summ + tmp);
    }
}
