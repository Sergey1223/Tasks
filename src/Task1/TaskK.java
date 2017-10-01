package Task1;

import java.util.Scanner;

public class TaskK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();
        System.out.println(minutes/60%24 + " " + (minutes%60));
    }
}
