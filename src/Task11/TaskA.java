package Task11;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(isDigit(scanner.nextLine().charAt(0)));
    }

    private static String isDigit(char c){
        int temp = c;
        return (temp > 47 && temp < 58) ? "yes" : "no";
    }
}