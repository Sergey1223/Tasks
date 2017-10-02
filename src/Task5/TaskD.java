package Task5;

import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextByte();
        int k = scanner.nextByte();
        System.out.println(c(k, n));
    }

    private static int c(int k, int n){
        if(k == 0 || k == n){
            return 1;
        }
        else return c(k - 1, n -1) + c(k, n - 1);
    }
}
