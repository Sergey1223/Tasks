package Task1;

import java.util.Scanner;

public class TaskH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int tmp = x/100;
        System.out.println((x - tmp * 100)/10);
    }
}
