package Task1;

import java.util.Scanner;

public class TaskJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speed = scanner.nextInt();
        int time = scanner.nextInt();
        double temp = speed * time;
        while (temp > 109){
            temp -= 109;
        }
        System.out.println(temp);
    }
}
