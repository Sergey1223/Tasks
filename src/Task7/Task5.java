package Task7;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int number = scanner.nextInt();
        while (number != 0){
            if(min > number){
                min = number;
            }
            number = scanner.nextInt();
        }
        System.out.println(min);
    }
}
