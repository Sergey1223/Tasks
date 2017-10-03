package Task7;

import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        int temp = 1;
        while (temp <= n){
            System.out.println(temp);
            temp <<= 1;
        }
    }
}
