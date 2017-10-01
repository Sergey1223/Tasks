package Task1;

import java.util.Scanner;

public class NextAndPreview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        System.out.println("The next number for the number " + number + " is " + (number + 1) + ".");
        System.out.println("The previous number for the number " + number + " is " + (number - 1) + ".");
    }
}
