package Task7;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int counter = 0;
        while (number != 0){
            counter++;
            number = scanner.nextInt();
        }
        System.out.println(counter);
    }
}
