package Task10;

import java.util.Scanner;

public class Task6 {
    private static Scanner scanner = new Scanner(System.in);
    private static Integer x;

    public static void main(String[] args) {
        correct(scanner.nextInt());
        System.out.println("x - " + x);
    }

    private static void correct(int a){
        if(a >= 0){
            x = a;
        }
    }
}
