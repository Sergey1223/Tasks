package Task9;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextShort();
        int temp;
        for (int i = 0; i < n; i++) {
            temp = scanner.nextInt();
            if((temp % 2) == 0) {
                System.out.println(temp);
            }
        }
    }
}
