package Task7;

import java.util.Scanner;

public class TaskF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        int counter = 1;
        while (x < y){
            x += x/10;
            counter++;
        }
        System.out.println(counter);
    }
}
