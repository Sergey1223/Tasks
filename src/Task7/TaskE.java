package Task7;

import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int counter = 0;
        while (1 << counter < n){
            counter++;
        }
        System.out.println(counter);
    }
}
