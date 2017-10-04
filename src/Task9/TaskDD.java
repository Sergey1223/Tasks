package Task9;

import java.util.Scanner;

public class TaskDD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(election(scanner.nextByte(), scanner.nextByte(), scanner.nextByte()));
    }

    private static int election(byte x, byte y, byte z){
        if(x == y){
            return x;
        }
        else if(x == z){
            return x;
        }
        else return y;
    }
}
