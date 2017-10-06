package Task10;

import java.util.Scanner;

public class TaskI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(c(scanner.nextInt(), scanner.nextInt()));
    }

    private static int c(int n, int k){
        if(k == 0 || k == n){
            return 1;
        }
        else return c(n - 1, k - 1) + c(n -1, k);
    }
}
