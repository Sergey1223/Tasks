package Task4;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        if (numberOne > numberTwo) {
            System.out.print(numberOne);
        }
        else {
            System.out.print(numberTwo);
        }
    }
}
