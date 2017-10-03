package Task7;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int counter = 1;
        while (counter * counter <= number){
            System.out.println(counter * counter);
            counter++;
        }
    }
}
