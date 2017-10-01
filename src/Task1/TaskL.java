package Task1;

import java.util.Scanner;

public class TaskL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int seconds = scanner.nextInt();
        double angle = 30 * hours + 0.5 * minutes + (0.5 * seconds)/60;
        if(angle < 180) System.out.println(angle);
        else System.out.println(360 - angle);
    }
}
