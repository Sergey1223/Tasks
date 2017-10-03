package Task7;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        char counter = number.charAt(0);
        for (int i = 1; i < number.length(); i++) {
            if(counter < number.charAt(i)){
                counter = number.charAt(i);
            }
        }
        System.out.println(counter);
    }
}
