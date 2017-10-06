package Task11;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(changeRegister(scanner.nextLine().charAt(0)));
    }

    private static char changeRegister(char c){
        if(Character.toUpperCase(c) == c){
            return Character.toLowerCase(c);
        }
        else return Character.toUpperCase(c);
    }
}
